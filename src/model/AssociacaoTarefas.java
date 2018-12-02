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

    public static boolean validar(int vetor[], int pessoasDesignadas, int solucaoAtual, int melhorSolucao) {
        int i, candidato = vetor[pessoasDesignadas - 1];

        if (solucaoAtual > melhorSolucao) {
            return false;
        }

        for (i = 0; i < pessoasDesignadas - 1; i++) {
            if (vetor[i] == candidato) {
                return false;
            }
        }

        return true;
    }

    public static boolean checarConflito(int linhaCandidato, int valor, NoSolucoes objSolucao) {
        if (objSolucao.getSomaSolucaoAtual() > objSolucao.getMelhorSolucao()) {
            objSolucao.setSomaSolucaoAtual(objSolucao.getSomaSolucaoAtual() - valor);
            return false;
        }
        for (int i = 0; i < objSolucao.getVetorSolucaoTemporaria().length; i++) {
            if (objSolucao.getVetorSolucaoTemporaria()[i] == linhaCandidato) {
                objSolucao.setSomaSolucaoAtual(objSolucao.getSomaSolucaoAtual() - valor);
                return false;
            }
        }

        return true;
    }

    public static boolean resolverAssociacaoDeTarefas(int matriz[][], int linhas, int colunas, int linhaInicio, int colunaInicio, NoSolucoes objSolucao, boolean primeirasolucao) { //int solucao[], int solucaoTemp[], boolean primeirasolucao, int melhorSolucao, int solucaoAtual

        if (colunaInicio == colunas) {
            return true; // encontrou uma solução
        }
       

        boolean sol;

        for (int i = 0; i < linhas; i++) {
            objSolucao.setSomaSolucaoAtual(objSolucao.getSomaSolucaoAtual() + matriz[i][colunaInicio]);
            if (checarConflito(i, matriz[i][colunaInicio], objSolucao)) { //  //true = sem conflitos, continua

                objSolucao.getVetorSolucaoTemporaria()[colunaInicio] = i;

                sol = resolverAssociacaoDeTarefas(matriz, linhas, colunas, 0, colunaInicio + 1, objSolucao, false);

                if (sol && colunaInicio == colunas-1) {
                    if (objSolucao.getMelhorSolucao() > objSolucao.getSomaSolucaoAtual()) {
                        System.arraycopy(objSolucao.getVetorSolucaoTemporaria(), 0, objSolucao.getVetorSolucao(), 0, objSolucao.getVetorSolucaoTemporaria().length);
                        objSolucao.setMelhorSolucao(objSolucao.getSomaSolucaoAtual());
                        objSolucao.getVetorSolucaoTemporaria()[colunaInicio] = -1;
                        objSolucao.setSomaSolucaoAtual(objSolucao.getSomaSolucaoAtual() - matriz[i][colunaInicio]);
                        return true;
                    }else{
                        objSolucao.getVetorSolucaoTemporaria()[colunaInicio] = -1;
                        objSolucao.setSomaSolucaoAtual(objSolucao.getSomaSolucaoAtual() - matriz[i][colunaInicio]);
                        return false;
                    }  
                } else {
                    objSolucao.getVetorSolucaoTemporaria()[colunaInicio] = -1;
                    objSolucao.setSomaSolucaoAtual(objSolucao.getSomaSolucaoAtual() - matriz[i][colunaInicio]);
                }
            } else {
                objSolucao.getVetorSolucaoTemporaria()[colunaInicio] = -1;
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
