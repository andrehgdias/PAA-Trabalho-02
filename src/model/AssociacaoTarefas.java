/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class AssociacaoTarefas {
    
    public static boolean validar(int vetor[], int pessoasDesignadas, int solucaoAtual, int melhorSolucao){
        int i, candidato = vetor[pessoasDesignadas - 1];
        
        if(solucaoAtual > melhorSolucao)
            return false;
        
        for(i = 0; i < pessoasDesignadas - 1; i++)
            if(vetor[i] == candidato)
                return false;
        
        return true;
    }
    
    public static void resolverAssociacaoDeTarefas(int matriz[][], int linhas, int colunas){
        
        int i, j = 0;
        int vetor[] = new int[colunas];
        int vetorSolucao[];
        vetorSolucao = new int[colunas];
        int melhorSolucao = Integer.MAX_VALUE, solucaoAtual = 0;
        
        boolean continua = true;
        boolean continua_j = true;
        
        for(i = 0; i < linhas && continua; i++){
                continua_j = true;
            for( ; j < colunas && continua_j; j++){
                
                System.out.println(matriz[i][j]); //para mostrar o caminho
                vetor[j] = matriz[i][j];
                vetorSolucao[j] = i + 1;
                solucaoAtual += matriz[i][j];
                if(!validar(vetor, i + 1, solucaoAtual, melhorSolucao)){
                   solucaoAtual -= matriz[i][j];
                    continua_j = false;
                }
                else i = 0;
            }

            if(j == colunas){ //encheu o vetor de solução
                melhorSolucao = solucaoAtual;
                continua = false;
                i++; //atualizando para a próxima iteração (começando uma nova solução)
            }

        }
        
        for(i = 0; i < colunas; i++){
            System.out.println("\n" + vetorSolucao[i]);
        }
        
    }
    
}
