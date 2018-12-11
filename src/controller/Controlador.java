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
import model.QuickSort;
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

        QuickSort.quicksort(itens, 0, itens.size() - 1);

        solucao = MochilaFracionaria.resolverMochilaFracionaria(itens, capacidade);
        return MochilaFracionaria.exibirSolucaoMochilaFracionaria(solucao, capacidade);
    }

    public static int[] associacaoDeTarefas(int matrizDoProblema[][], int numPessoas, int numTarefas) {
        NoSolucoes solucaoEx1 = new NoSolucoes(numTarefas);

        for (int k = 0; k < numTarefas; k++) {
            solucaoEx1.getVetorSolucaoTemporaria()[k] = -1;
        }
        AssociacaoTarefas.resolverAssociacaoDeTarefas(matrizDoProblema, numPessoas, numTarefas, 0, 0, solucaoEx1, true);
        
        return solucaoEx1.getVetorSolucao();
    }

    public static String mochilaBooleana(ArrayList<Item> itens, int capacidade) {
        return MochilaBooleana.resolverMochilaBooleana(itens, capacidade);
    }

    public static void huffmanCompressao(String entrada, ArrayList<NoHuffman> nos, ArrayList<String> codigos) {
        HuffmanCompressao huffman = new HuffmanCompressao();
        huffman.resolverHuffmanCompressao(entrada, nos, codigos);
    }

    public static void gerarTabelasSubsequencia(char vetorX[], char vetorY[], char B[][], int C[][]){
        
        SubsequenciaMaisLonga.constroiTabelas(vetorX, vetorY, B, C, 0, 0);
        
    }
    
    public static String subsequenciaMaisLonga(char B[][], char vetorX[], int tamanhoX, int tamanhoY) {

        return SubsequenciaMaisLonga.imprimeSolucao(B, vetorX, tamanhoX - 1, tamanhoY - 1);

    }

}
