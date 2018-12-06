package trabalhopaa02;

import java.util.ArrayList;
import model.AssociacaoTarefas;
import model.FilaPrioridade;

import model.NoSolucoes;
import model.Item;
import model.MochilaFracionaria;
import model.NoHuffman;

import model.SubsequenciaMaisLonga;

public class Principal {

    public static void main(String[] args) {

        /*********************************** ASSOCIAÇÃO DE TAREFAS ****************************************
        int matriz[][] = {  {11, 12, 18, 40}, //Matriz 4x4 -> Linha = Pessoa, Coluna = Tarefa
                            {14, 15, 13, 22},
                            {11, 17, 19, 23},
                            {17, 14, 20, 28}};

        NoSolucoes solucaoEx1 = new NoSolucoes();

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

        /************************************ SUBSEQUÊNCIA MÁXIMA ****************************************

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

    /************************************ SUBSEQUÊNCIA MÁXIMA ****************************************/ 
        
        FilaPrioridade fila = new FilaPrioridade();
        NoHuffman no1 = new NoHuffman('a', 20);
        NoHuffman no3 = new NoHuffman('c', 21);
        NoHuffman no2 = new NoHuffman('b', 23);
        
        NoHuffman no4 = new NoHuffman('d', 19);
        fila.addNo(no1);
        fila.addNo(no2);
        fila.addNo(no3);
        fila.addNo(no4);
        fila.exibir();
 
    }

}
