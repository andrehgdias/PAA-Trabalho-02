package trabalhopaa02;

import java.util.ArrayList;
import model.AssociacaoTarefas;

import model.NoSolucoes;
import model.Item;
import model.MochilaFracionaria;

import model.SubsequenciaMaisLonga;

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


        int m = 8;	//comprimento de X
        int n = 7;	//comprimento de Y
        
        char X[] = new char[m];
        char Y[] = new char[n];
        
        X[0] = '\0';
        X[1] = 'A';
        X[2] = 'A';
        X[3] = 'B';
        X[4] = 'B';
        X[5] = 'A';
        X[6] = 'A';
        X[7] = 'A';
        
        Y[0] = '\0';
        Y[1] = 'A';
        Y[2] = 'A';
        Y[3] = 'A';
        Y[4] = 'A';
        Y[5] = 'A';
        Y[6] = 'A';
        
        char B[][] = new char[X.length][Y.length];
        int C[][] = new int[X.length][Y.length];
        
        int i = 0;
        int j = 0;
        int armazenaIeJ[] = new int[2]; //armazena os valores de i e j alterados no primeiro método para serem utilizados no segundo método
        
        SubsequenciaMaisLonga.constroiTabelas(X, Y, B, C, i, j, armazenaIeJ);

        i = armazenaIeJ[0];
        j = armazenaIeJ[1];
        
        SubsequenciaMaisLonga.imprimeSolucao(B, X, i-1, j-1);

    }

}
