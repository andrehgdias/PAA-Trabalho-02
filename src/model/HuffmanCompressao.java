/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class HuffmanCompressao {
    
    private int frequencia[];
    private FilaPrioridade fila;
    private NoHuffman copiaPrimeiroNo;
    
    
    public HuffmanCompressao(){
        this.frequencia = new int[93];
        this.fila = new FilaPrioridade();
        this.copiaPrimeiroNo = null;
    }

    public FilaPrioridade getFila() {
        return fila;
    }

    public void setFila(FilaPrioridade fila) {
        this.fila = fila;
    }

    public int[] getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int[] frequencia) {
        this.frequencia = frequencia;
    }
    
    /*
    Essa função passa para o vetor frequencia a quantidade de vezes que cada caractere apareceu
    na string passada como parâmetro. Usamos o código da tabela ASCII para saber a posição 
    correta daquele char no vetor.
    */
    public void lerEntrada(String texto){
        //inicializando o vetor
        for(int i = 0; i < 93; i++)
            this.frequencia[i] = 0;
        
        //atribuindo a quantidade de ocorrências às devidas posições
        for(int i = 0; i < texto.length(); i++){
            int pos = (int)texto.charAt(i) - 32;
            this.frequencia[pos]++;
        }
    }
    
    /*
    Essa função deve criar um nó se o respectivo char tenha sido utilizado no texto e 
    colocá-lo em uma fila de prioridade (crescente)
    */
    public void adicionarUsados(){
        
        for(int i = 0; i < 93; i++){
            if(this.frequencia[i] != 0){ //aparece pelo menos uma vez
                NoHuffman no = new NoHuffman((char)(i + 32), this.frequencia[i]);
                this.fila.addNo(no);
            }
        }
    }
    
    /*
    Essa função cria um nó cujos filhos da esq é no1 e da dir é no2
    O caractere do nó criado é '~', pois como não aceitamos o til na entrada, sabemos que se trata de um nó auxiliar
    Retorna o nó que criamos
    */
    public NoHuffman juntarNos(NoHuffman no1, NoHuffman no2){
        NoHuffman novoNo = new NoHuffman('~', no1.getFrequencia() + no2.getFrequencia());
        novoNo.setEsq(no1);
        novoNo.setDir(no2);
        no1.setPai(novoNo);
        no2.setPai(novoNo);
        return novoNo;
    }
    
    /*
    Essa função deixa nossa fila apenas com um único elemento, que é a raiz da nossa árvore para compressão
    */
    public void montarArvore(){
        //faço essa primeira iteração fora do while para pegar o primeiro elemento da lista e poder 
        //percorrê-la mais tarde quando a fila só contiver a raiz da árvore
        NoHuffman aux1 = this.fila.removerNo();
        this.copiaPrimeiroNo = aux1;
        NoHuffman aux2 = this.fila.removerNo();
        NoHuffman noCriado = juntarNos(aux1, aux2); //juntando os nós em um só
        this.fila.addNo(noCriado);
        
        while(fila.getCont() > 1){ //enquanto houver mais que um nó na fila
            aux1 = this.fila.removerNo();
            aux2 = this.fila.removerNo();
            noCriado = juntarNos(aux1, aux2); //juntando os nós em um só
            this.fila.addNo(noCriado);
        }
    }
    
    public void exibirArvorePreOrdem(NoHuffman no){
        if(no != null){
            System.out.println(no.getCaractere() + ", " + no.getFrequencia() + "\n");
            exibirArvorePreOrdem(no.getEsq());
            exibirArvorePreOrdem(no.getDir());
        }
    }
    
    /*
    Dado um nó, essa função retorna seu código de Huffman a partir da árvore binária
    */
    public String recuperarCodigo(NoHuffman no){
        String codigo = "";
        
        while(no.getPai() != null){ //enquanto não chegar na raiz da árvore
            if(no.getPai().getEsq() == no) //se o nó for filho à esquerda
                codigo += "0";
            else //se o nó for filho à direita
                codigo += "1";
            no = no.getPai();
        }
        
        return codigo;
    }
    
    /*
    Essa função lê a entrada, monta a árvore e imprime no console o código e a frequência dos caracteres utilizados
    */
    public String resolverHuffmanCompressao(String entrada){
        String solucao = "";
        
        this.lerEntrada(entrada);
        this.adicionarUsados();
        this.montarArvore();
        this.exibirArvorePreOrdem(this.getFila().getInicio());
        
        NoHuffman no = this.copiaPrimeiroNo;
        
        while(no != null){
            if(no.getCaractere() != '~')
                System.out.println(no.getCaractere() + ", " + no.getFrequencia() + ", " + this.recuperarCodigo(no) + "\n");
            no = no.getProx();
        }
        
        return solucao;
    }
    
}
