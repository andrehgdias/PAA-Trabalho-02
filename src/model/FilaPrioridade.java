/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class FilaPrioridade {
 
    private ArrayList<NoHuffman> fila;
    private NoHuffman inicio;

    public FilaPrioridade(){
        fila = new ArrayList<>();
        inicio = null;
    }
    
    public ArrayList<NoHuffman> getFila() {
        return fila;
    }

    public void setFila(ArrayList<NoHuffman> fila) {
        this.fila = fila;
    }

    public NoHuffman getInicio() {
        return inicio;
    }

    public void setInicio(NoHuffman inicio) {
        this.inicio = inicio;
    }
    
    public void addNo(NoHuffman novoNo){
        System.out.println("ENTROU "+novoNo.getFrequencia());
        System.out.println("LISTA ATÉ AQUI: ");
        this.exibir();
        NoHuffman anterior = null, atual;
        
        if(fila.isEmpty()){
            fila.add(novoNo);
            this.setInicio(novoNo);
        }
        else{
            atual = this.getInicio();
            while(atual != null && atual.getFrequencia() < novoNo.getFrequencia()){
                anterior = atual;
                atual = atual.getProx();
            }
            if(atual == null && anterior != null){ //inserção no fim
                fila.add(novoNo);
                anterior.setProx(novoNo);
            }
            else if(anterior != null && atual != null && atual.getFrequencia() >= novoNo.getFrequencia()){ //chegou na posição correta. Inserção entre dois elementos
                fila.add(novoNo);
                anterior.setProx(novoNo);
                novoNo.setProx(atual);
            }
            else{ //inserção no início
                fila.add(novoNo);
                novoNo.setProx(atual);
                this.setInicio(novoNo);
            }
        }
    }
    
    public void exibir(){
        for(int i = 0; i < fila.size(); i++)
            System.out.println("["+i+"]: " + fila.get(i).getFrequencia());
    }
    
}
