package trabalhopaa02;

import model.AssociacaoTarefas;
import model.NoSolucoes;

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
        
//        int matriz[][] = {{ 5,5,6,9 },  //Matriz 4x4 -> Linha = Pessoa, Coluna = Tarefa
//                          { 3,1,4,4 },
//                          { 3,5,13,3 },
//                          {3,9,14,10}};
        
        int matriz[][] = {{ 11,12,18,40 },  //Matriz 4x4 -> Linha = Pessoa, Coluna = Tarefa
                          { 14,15,13,22 },
                          { 11,17,19,23 },
                          {17,14,20,28}};

        NoSolucoes solucao = new NoSolucoes();
        
            for(int k=0; k < 4; k++) solucao.getVetorSolucaoTemporaria()[k] = -1;
            AssociacaoTarefas.resolverAssociacaoDeTarefas(matriz, 4, 4, 0, 0, solucao, true);//solucao.getVetorSolucao(), olucao.getVetorSolucaoTemporaria(), resposta, solucao.getMelhorSolucao(), solucao.getSomaSolucaoAtual());
            
            for(int j=0; j < 4; j++) System.out.println(solucao.getVetorSolucaoTemporaria()[j]);
            for(int j=0; j < 4; j++) System.out.println(solucao.getVetorSolucao()[j]);

        
    }
    
}
