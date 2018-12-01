/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopaa02;

import model.AssociacaoTarefas;

/**
 *
 * @author andre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int matriz[][] = new int[4][4];
        
        int matriz[][] = {{ 5,5,6,9 },  //Matriz 4x4 -> Linha = Pessoa, Coluna = Tarefa
                          { 3,1,4,4 },
                          { 3,5,13,3 },
                          {3,9,14,10}};
//        
//        matriz[0][0] = 5;
//        matriz[0][1] = 5;
//        matriz[0][2] = 6;
//        matriz[0][3] = 9;
//        matriz[1][0] = 3;
//        matriz[1][1] = 1;
//        matriz[1][2] = 4;
//        matriz[1][3] = 4;
//        matriz[2][0] = 3;
//        matriz[2][1] = 5;
//        matriz[2][2] = 13;
//        matriz[2][3] = 3;
//        matriz[3][0] = 3;
//        matriz[3][1] = 9;
//        matriz[3][2] = 14;
//        matriz[3][3] = 10;
        int solucao[] = {-1,-1,-1,-1};
        int solucaoTemporaria[] = {-1,-1,-1,-1};
        
        int melhorSolucao = Integer.MAX_VALUE, solucaoAtual = 0;
        
        for(int i=0; i < 4; i++){
            boolean resposta = false; 
            if(i == 0)resposta = true;
            
            for(int k=0; k < 4; k++) solucaoTemporaria[k] = -1;
            AssociacaoTarefas.resolverAssociacaoDeTarefas(matriz, 4, 4, i, 0, solucao, solucaoTemporaria, resposta, melhorSolucao, solucaoAtual);
            
            for(int j=0; j < 4; j++) System.out.println(solucaoTemporaria[j]);
            for(int j=0; j < 4; j++) System.out.println(solucao[j]);
        }
        
    }
    
}
