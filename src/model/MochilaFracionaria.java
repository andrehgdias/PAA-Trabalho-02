/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MochilaFracionaria {

    private ArrayList<Item> itens;
    
    /*
    Essa função necessita que o ArrayList de itens esteja ordenado de forma decrescente em 
    relação ao valor, ou seja, as primeiras posições devem conter os itens com maior valor
    Os parâmetros são um ArrayList contendo todos os itens disponíveis e a capacidade da mochila
    Retorna um ArrayList com os itens da solução, já com a quantidade(fração) certa de cada um 
    */
    public static ArrayList<Item> resolverMochilaFracionaria(ArrayList<Item> itens, int capacidadeMochila){
        
        ArrayList<Item> solucao = new ArrayList<>();
        
        for(int i = 0; i < itens.size() && capacidadeMochila != 0; i++){
            if(itens.get(i).getPeso() <= capacidadeMochila){
                capacidadeMochila -= itens.get(i).getPeso();
            }
            else{
                itens.get(i).setQuantidade((double) capacidadeMochila / itens.get(i).getPeso());
                capacidadeMochila = 0;
            }
            solucao.add(itens.get(i));
        }
        
        return solucao;
    }
    
    
    /*
    Essa função imprime a solução do problema da Mochila Fracionária, ou seja, tanto os itens
    contidos na solução quanto o valor final da mochila
    Recebe como parâmetro o ArrayList da nossa solução
    Retorna uma String com todas essas informações
    */
    public static String exibirSolucaoMochilaFracionaria(ArrayList<Item> itens){
        String txt = "";
        double valorAgregado = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        
        for(int i = 0; i < itens.size(); i++){
            txt += "Item: " + itens.get(i).getNome() + "\n" +
                   "Valor por unidade: R$" + itens.get(i).getValor() + "\n" +
                   "Peso por unidade: " + itens.get(i).getPeso() + " kg\n" +
                   "Quantidade: " + itens.get(i).getQuantidadeFormatada()+ "\n\n";
            valorAgregado += itens.get(i).getQuantidade() * itens.get(i).getValor();
        }
        
        txt += "O valor total da mochila é de R$" + df.format(valorAgregado);
        System.out.println(txt);

        return txt;        
    }
}
