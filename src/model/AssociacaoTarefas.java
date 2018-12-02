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
        int pularLinha = 0;
        if (!primeirasolucao) {
            pularLinha = linhaInicio;
        }

        boolean sol;

        for (int i = pularLinha; i < linhas; i++) {
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

    }
}
