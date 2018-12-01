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
    
    public static int checarConflito(int solucaoTemp[], int linhaCandidato, int melhorSolucao, int solucaoAtual, int valor){
        if(solucaoAtual > melhorSolucao){
            solucaoAtual -= valor;
            return solucaoAtual;
        }
        for(int i = 0; i < solucaoTemp.length; i++)
            if(solucaoTemp[i] == linhaCandidato){
                solucaoAtual -= valor;
                return solucaoAtual;
            }                
        
        return solucaoAtual;
    }       
            
    public static boolean resolverAssociacaoDeTarefas(int matriz[][], int linhas, int colunas, int linhaInicio, int colunaInicio, int solucao[], int solucaoTemp[], boolean primeirasolucao, int melhorSolucao, int solucaoAtual){
            
        if(colunaInicio == colunas){
            //Verifica a solução
            return true; // encontrou uma solução
        }
        int pularLinha = 0;
        if(!primeirasolucao) pularLinha = linhaInicio;
        
        boolean sol;

        for (int i=pularLinha; i<linhas; i++) {
            int aux = solucaoAtual += matriz[i][colunaInicio];
            if(aux == (solucaoAtual = checarConflito(solucaoTemp, i, melhorSolucao, solucaoAtual, matriz[i][colunaInicio]))){ //  //true = sem conflitos, continua
                solucaoTemp[colunaInicio] = i;
      
                sol = resolverAssociacaoDeTarefas(matriz, linhas, colunas, 0, colunaInicio + 1, solucao, solucaoTemp, false, melhorSolucao, solucaoAtual);
                
                if(i == linhas - 1){
                    
                    if(sol){
                        if(melhorSolucao > solucaoAtual){
                            System.arraycopy(solucaoTemp, 0, solucao, 0, solucaoTemp.length);
                            melhorSolucao = solucaoAtual;
                        }
                        solucaoTemp[colunaInicio] = -1;
                        return true;
                    } //Encontrou uma solução
                    else{
                        solucaoTemp[colunaInicio] = -1;
                        solucaoAtual -= matriz[i][colunaInicio];
                    }
                }else{
                    solucaoTemp[colunaInicio] = -1;
                    solucaoAtual -= matriz[i][colunaInicio];
                }
            }
        }
        
        return false;
        
        
        
//        int i, j = 0;
//        int vetor[] = new int[colunas];
//        int vetorSolucao[];
//        vetorSolucao = new int[colunas];
//        int melhorSolucao = Integer.MAX_VALUE, solucaoAtual = 0;
//        
//        boolean continua = true;
////        boolean continua_j = true;
//        
//        for(i = 0; i < linhas && continua; i++){
////                continua_j = true;
//            for( ; j < colunas; j++){ // && continua_j
//                
//                System.out.println(matriz[i][j]); //para mostrar o caminho
//                vetor[j] = matriz[i][j];
//                vetorSolucao[j] = i + 1;
//                solucaoAtual += matriz[i][j];
//                if(!validar(vetor, i + 1, solucaoAtual, melhorSolucao)){
//                   solucaoAtual -= matriz[i][j];
////                    continua_j = false;
//                    break;
//                }
//                else i = 0;
//            }
//
//            if(j == colunas){ //encheu o vetor de solução
//                melhorSolucao = solucaoAtual;
//                continua = false;
//                i++; //atualizando para a próxima iteração (começando uma nova solução)
//            }
//
//        }
//        
//        for(i = 0; i < colunas; i++){
//            System.out.println("\n" + vetorSolucao[i]);
//        }
        
    }
    
}
