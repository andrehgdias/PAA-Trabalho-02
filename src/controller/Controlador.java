/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Item;
import model.MochilaFracionaria;

/**
 *
 * @author User
 */
public class Controlador {
    
    public static String mochilaFracionaria(ArrayList<Item> itens, double capacidade){
        ArrayList<Item> solucao;
        
        Item.ordenarPorValor(itens);
        
        solucao = MochilaFracionaria.resolverMochilaFracionaria(itens, capacidade);
        return MochilaFracionaria.exibirSolucaoMochilaFracionaria(solucao);
    }
    
}
