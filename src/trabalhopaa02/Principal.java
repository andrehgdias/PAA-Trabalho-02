package trabalhopaa02;

import java.util.ArrayList;
import model.AssociacaoTarefas;

import model.NoSolucoes;
import model.Item;
import model.MochilaFracionaria;

public class Principal {

    public static void main(String[] args) {

//        int matriz[][] = new int[4][4];
//        int matriz[][] = {{ 5,5,6,9 },  //Matriz 4x4 -> Linha = Pessoa, Coluna = Tarefa
//                          { 3,1,4,4 },
//                          { 3,5,13,3 },
//                          {3,9,14,10}};
        int matriz[][] = {{11, 12, 18, 40}, //Matriz 4x4 -> Linha = Pessoa, Coluna = Tarefa
        {14, 15, 13, 22},
        {11, 17, 19, 23},
        {17, 14, 20, 28}};

        NoSolucoes solucaoEx1 = new NoSolucoes();

        for (int k = 0; k < 4; k++) {
            solucaoEx1.getVetorSolucaoTemporaria()[k] = -1;
        }
        AssociacaoTarefas.resolverAssociacaoDeTarefas(matriz, 4, 4, 0, 0, solucaoEx1, true);//solucao.getVetorSolucao(), olucao.getVetorSolucaoTemporaria(), resposta, solucao.getMelhorSolucao(), solucao.getSomaSolucaoAtual());

        for (int j = 0; j < 4; j++) {
            System.out.println(solucaoEx1.getVetorSolucaoTemporaria()[j]);
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(solucaoEx1.getVetorSolucao()[j]);
        }

        Item item1 = new Item("Item 1", 40, 840, 1);
        Item item2 = new Item("Item 2", 30, 600, 1);
        Item item3 = new Item("Item 3", 20, 400, 1);
        Item item4 = new Item("Item 4", 10, 100, 1);

        ArrayList<Item> solucao;
        ArrayList<Item> itens = new ArrayList<>();

        itens.add(item1);
        itens.add(item3);
        itens.add(item4);
        itens.add(item2);

        Item.ordenarPorValor(itens);
        solucao = MochilaFracionaria.resolverMochilaFracionaria(itens, 50);
        MochilaFracionaria.exibirSolucaoMochilaFracionaria(solucao);

//        int matriz[][] = new int[4][4];
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
//        
//        AssociacaoTarefas.resolverAssociacaoDeTarefas(matriz, 4, 4);
    }

}
