/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

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
    
    
}
