/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;
import java.util.ArrayList;
import model.AssociacaoTarefas;
import model.Item;
import model.MochilaBooleana;
import model.MochilaFracionaria;
import model.NoSolucoes;

/**
 *
 * @author User
 */
public class Controlador {
    
    public static String mochilaFracionaria(ArrayList<Item> itens, double capacidade){
        ArrayList<Item> solucao;
        double copiaCapacidadeMochila = capacidade;
        
        Item.ordenarPorValor(itens);
        
        solucao = MochilaFracionaria.resolverMochilaFracionaria(itens, capacidade);
        return MochilaFracionaria.exibirSolucaoMochilaFracionaria(solucao, copiaCapacidadeMochila);
    }
    
    public static void associacaoDeTarefas(int matrizDoProblema[][], int numPessoas, int numTarefas){
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
    
    public static String mochilaBooleana(ArrayList<Item> itens, int capacidade){
        return MochilaBooleana.resolverMochilaBooleana(itens, capacidade);
    }
    
}
