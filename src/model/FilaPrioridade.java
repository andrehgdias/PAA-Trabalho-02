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
 
    private NoHuffman inicio;
    private NoHuffman fim;

    public FilaPrioridade(){
        this.inicio = null;
        this.fim = null;
    }

    public NoHuffman getInicio() {
        return inicio;
    }

    public void setInicio(NoHuffman inicio) {
        this.inicio = inicio;
    }

    public NoHuffman getFim() {
        return fim;
    }

    public void setFim(NoHuffman fim) {
        this.fim = fim;
    }

    /*
    Essa função insere um nó na lista encadeada baseado em sua frequência, sendo que os nós com menores
    frequências ficam no começo da lista, ou seja, a frequência é crescente
    */
    public void addNo(NoHuffman novoNo){
        NoHuffman anterior = null, atual;
        
        if(this.inicio == null){ //fila vazia
            this.inicio = novoNo;
            this.fim = novoNo;
        }
        else{
            atual = this.inicio;
            while(atual != null && atual.getFrequencia() <= novoNo.getFrequencia()){
                anterior = atual;
                atual = atual.getProx();
            }
            if(anterior == null){ //inserção no início
                novoNo.setProx(this.inicio);
                this.inicio = novoNo;
            }
            else if(atual == null){ //inserção no fim
                anterior.setProx(novoNo);
                this.fim = novoNo;
            }
            else{ //inserção entre dois elementos
                anterior.setProx(novoNo);
                novoNo.setProx(atual);
                //this.fim = atual;
            }
        }
    }
    
    /*
    Essa função exibe no console a lista encadeada com o caractere, a frequencia e o próximo de cada nó
    */
    public void exibir(){
        NoHuffman no = this.inicio;
        while(no != null){
            System.out.println("\n" + no.getCaractere() + ", " + no.getFrequencia());
            no = no.getProx();
            if(no != null)  System.out.println("PROX: " + no.getFrequencia());
            else System.out.println("PROX: null");
        }
    }
    
}
