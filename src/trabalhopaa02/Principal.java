package trabalhopaa02;

import java.util.ArrayList;
import model.AssociacaoTarefas;
import model.FilaPrioridade;
import model.HuffmanCompressao;
import model.NoSolucoes;
import model.Item;
import model.MochilaBooleana;
import model.MochilaFracionaria;
import model.NoHuffman;
import model.SubsequenciaMaisLonga;

public class Principal {

    public static void main(String[] args) {

        /*********************************** ASSOCIAÇÃO DE TAREFAS ****************************************

        int matriz[][] = {{11, 12, 18, 40}, //Matriz 4x4 -> Linha = Pessoa, Coluna = Tarefa
                          {14, 15, 13, 22},
                          {11, 17, 19, 23},
                          {17, 14, 20, 28}};

        NoSolucoes solucaoEx1 = new NoSolucoes(4);
        
        for (int k = 0; k < 4; k++) {
            solucaoEx1.getVetorSolucaoTemporaria()[k] = -1;
        }
        
        AssociacaoTarefas.resolverAssociacaoDeTarefas(matriz, 4, 4, 0, 0, solucaoEx1, true);

        for (int j = 0; j < 4; j++) {
            System.out.println(solucaoEx1.getVetorSolucao()[j]);
        }

        /************************************ MOCHILA FRACIONARIA *****************************************
        Item item1 = new Item("Item 1", 5, 10, 1); //(nome, peso, valor, quantidade)
        Item item2 = new Item("Item 2", 1, 50, 1);
        Item item3 = new Item("Item 3", 3, 14, 1);

        ArrayList<Item> solucao;
        ArrayList<Item> itens = new ArrayList<>();

        itens.add(item1);
        itens.add(item2);
        itens.add(item3);

        Item.ordenarPorValor(itens);
        solucao = MochilaFracionaria.resolverMochilaFracionaria(itens, 2);
        System.out.println(MochilaFracionaria.exibirSolucaoMochilaFracionaria(solucao));

        /************************************ SUBSEQUÊNCIA MÁXIMA ****************************************/

        int m = 8;	//comprimento de X
        int n = 7;	//comprimento de Y
        
        char X[] = new char[m];
        char Y[] = new char[n];
        
        X[0] = '\0';
        X[1] = '|';
        X[2] = '\\';
        X[3] = 'B';
        X[4] = 'B';
        X[5] = 'C';
        X[6] = 'C';
        X[7] = 'C';
        
        Y[0] = '\0';
        Y[1] = 'A';
        Y[2] = '\\';
        Y[3] = 'B';
        Y[4] = 'B';
        Y[5] = 'A';
        Y[6] = 'C';
        
        char B[][] = new char[X.length][Y.length];
        int C[][] = new int[X.length][Y.length];
        
//        int i = 0;
//        int j = 0;
//        int armazenaIeJ[] = new int[2]; //armazena os valores de i e j alterados no primeiro método para serem utilizados no segundo método
//        
        SubsequenciaMaisLonga.constroiTabelas(X, Y, B, C, 0, 0);
        
//        System.out.println(armazenaIeJ[0]);
//        System.out.println(armazenaIeJ[1]);

//        i = armazenaIeJ[0];
//        j = armazenaIeJ[1];
        
        SubsequenciaMaisLonga.imprimeSolucao(B, X, m-1, n-1);

    /************************************** CÓDIGO DE HUFFMAN ******************************************
        
        FilaPrioridade fila = new FilaPrioridade();
        NoHuffman no1 = new NoHuffman('b', 20);
        NoHuffman no2 = new NoHuffman('d', 23);
        NoHuffman no3 = new NoHuffman('c', 22);
        NoHuffman no4 = new NoHuffman('a', 19);
        
        fila.addNo(no1);
        fila.addNo(no2);
        fila.addNo(no3);
        fila.addNo(no4);
        
        //fila.exibir();
        
        ArrayList<NoHuffman> nos = new ArrayList<>();
        ArrayList<String> codigos = new ArrayList<>();
        String txt = "fffffeeeeeeeeeccccccccccccbbbbbbbbbbbbbddddddddddddddddaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        HuffmanCompressao huffman = new HuffmanCompressao();
        huffman.resolverHuffmanCompressao(txt, nos, codigos);
        for(int i = 0; i < nos.size(); i++){
            System.out.println(nos.get(i).getCaractere() + ", " + codigos.get(i));
        }
        
    /************************************** MOCHILA BOOLEANA ******************************************
        
//        Item item1 = new Item("Item 1", 2, 3, 1); //(nome, peso, valor, quantidade)
//        Item item2 = new Item("Item 2", 3, 6, 1);
//        Item item3 = new Item("Item 3", 6, 9, 1);

        Item item1 = new Item("Item 1", 3, 25, 1); //(nome, peso, valor, quantidade)
        Item item2 = new Item("Item 2", 5, 12, 1);
        Item item3 = new Item("Item 3", 13, 27, 1);
        Item item4 = new Item("Item 4", 1, 2, 1);
//        Item item5 = new Item("Item 5", 5, 10, 1);
        
        
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
//        itens.add(item5);
        
        System.out.println(itens.size());
        System.out.println(MochilaBooleana.resolverMochilaBooleana(itens, 10));
        
        
        /*********************************************************************************************/
    }

}
