/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.AssociacaoTarefas;
import model.HuffmanCompressao;
import model.Item;
import model.MochilaBooleana;
import model.MochilaFracionaria;
import model.NoHuffman;
import model.NoSolucoes;
import model.SubsequenciaMaisLonga;
import model.Util;

/**
 *
 * @author User
 */
public class Controlador {

    public static String mochilaFracionaria(ArrayList<Item> itens, double capacidade) {
        ArrayList<Item> solucao;
        double copiaCapacidadeMochila = capacidade;

        Item.ordenarPorValor(itens);

        solucao = MochilaFracionaria.resolverMochilaFracionaria(itens, capacidade);
        return MochilaFracionaria.exibirSolucaoMochilaFracionaria(solucao, copiaCapacidadeMochila);
    }

    public static void associacaoDeTarefas(int matrizDoProblema[][], int numPessoas, int numTarefas) {
        NoSolucoes solucaoEx1 = new NoSolucoes(numTarefas);

        for (int k = 0; k < 4; k++) {
            solucaoEx1.getVetorSolucaoTemporaria()[k] = -1;
        }
        AssociacaoTarefas.resolverAssociacaoDeTarefas(matrizDoProblema, numPessoas, numTarefas, 0, 0, solucaoEx1, true);

        for (int j = 0; j < numTarefas; j++) {
            System.out.println(solucaoEx1.getVetorSolucaoTemporaria()[j]);
        }
        for (int j = 0; j < numTarefas; j++) {
            System.out.println(solucaoEx1.getVetorSolucao()[j]);
        }
    }

    public static String mochilaBooleana(ArrayList<Item> itens, int capacidade) {
        return MochilaBooleana.resolverMochilaBooleana(itens, capacidade);
    }

    public static void huffmanCompressao(String entrada, ArrayList<NoHuffman> nos, ArrayList<String> codigos) {
        HuffmanCompressao huffman = new HuffmanCompressao();
        huffman.resolverHuffmanCompressao(entrada, nos, codigos);
    }

    public static void subsequenciaMaisLonga(String X, String Y) {
        
        int tamanhoX = X.length() + 1;
        int tamanhoY = Y.length() + 1;
        char vetorX[] = new char[tamanhoX];
        char vetorY[] = new char[tamanhoY];

        vetorX = Util.stringToArray(X, tamanhoX, true);
        vetorY = Util.stringToArray(Y, tamanhoY, true);

        char B[][] = new char[tamanhoX][tamanhoY];
        int C[][] = new int[tamanhoX][tamanhoY];

        SubsequenciaMaisLonga.constroiTabelas(vetorX, vetorY, B, C, 0, 0);

        SubsequenciaMaisLonga.imprimeSolucao(B, vetorX, tamanhoX - 1, tamanhoY - 1);

    }

}
