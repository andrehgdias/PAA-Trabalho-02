/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Item{

    private String nome;
    private double peso;
    private double valor;
    private double quantidade; //usamos para especificar a fração daquele item no vetor de solução

    public Item(String nome, double peso, double valor, double quantidade){ //quando lermos os itens do usuário, quantidade deverá ser 1
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }
    
    public String getQuantidadeFormatada(){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(quantidade);
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /*
    Essa função é um Bubble Sort que ordena um ArrayList de itens decrescentemente em 
    relação ao valor, ou seja, os itens de maior valor ficam no início do ArrayList
    */
    public static void ordenarPorValor(ArrayList<Item> itens){
        for (int i = 0; i < itens.size() - 1; i++) {
            Item item1 = itens.get(i);
            for (int j = i + 1; j < itens.size(); j++) {
                Item item2 = itens.get(j);
                if (item1.getValor() < item2.getValor()) { //ordem decrescente
                    Item aux = item1;
                    itens.set(i, item2);
                    itens.set(j, aux);
                }
            }
        }
    }
    
}
