/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MochilaBooleana {
    
    public static String resolverMochilaBooleana(ArrayList<Item> itens, int capacidade){ //capacidade deve ser inteira
        ArrayList<Item> solucao = new ArrayList<>();
        
        int linhas = itens.size() + 1;
        int colunas = capacidade + 1;
        int[][] tabela = new int[linhas][colunas];
        int i, j;
        
        //preenchendo primeira linha e primeira coluna com 0
        for(i = 0; i < linhas; i++)
            tabela[i][0] = 0;
        for(i = 0; i < colunas; i++)
            tabela[0][i] = 0;
        
        //montando a tabela
        for(i = 1; i < linhas; i++){                //verificar se é só < ou <=
            for(j = 1; j < colunas; j++){
                if(itens.get(i - 1).getPeso() <= j){ //item cabe
                    int pos = j - (int)itens.get(i - 1).getPeso();      //na interface, só aceitar valor inteiro
                    tabela[i][j] = tabela[i - 1][pos] + (int) itens.get(i - 1).getValor();
                }
                else{ //item não cabe
                    tabela[i][j] = 0;
                    if(tabela[i][j] < tabela[i - 1][j]){ 
                        tabela[i][j] = tabela[i - 1][j];
                    }
                }
            }
        }
        
        //encontrando a solução
        i = linhas - 1;
        j = colunas - 1;
        int maxValor = tabela[i][j];
        String textoSolucao = "";
        
        while(i > 0){
            if(tabela[i - 1][j] != tabela[i][j]){
                solucao.add(itens.get(i - 1));
                j -= (int) itens.get(i - 1).getPeso();
                i--;
            }
            else i--;
        }
        
        textoSolucao += "Capacidade da mochila: " + capacidade + " kg\n" +
                        "O valor máximo da mochila é: R$" + maxValor + ",00\n\n" +
                        "Itens da solução:\n";
        for(i = 0; i < solucao.size(); i++)
            textoSolucao += "- " + (solucao.get(i).getNome()) + "\n";
                            
        return textoSolucao;
    }
    
}
