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
    
    private int frequencia[] = new int[93];
    
    /*
    Essa função passa para o vetor frequencia a quantidade de vezes que cada caractere apareceu
    na string passada como parâmetro. Usamos o código da tabela ASCII para saber a posição 
    correta daquele char no vetor.
    */
    public void lerEntrada(String texto){
        //inicializando o vetor
        for(int i = 0; i < 93; i++){
            frequencia[i] = 0;
        }
        
        //atribuindo a quantidade de ocorrências às devidas posições
        for(int i = 0; i < texto.length(); i++){
            int pos = (int)texto.charAt(i) - 32;
            frequencia[pos]++;
        }
    }
    
    /*
    Essa função deve criar um nó se o respectivo char tenha sido utilizado no texto e 
    colocá-lo em uma fila de prioridade (crescente)
    */
    public void excluirNaoUsados(){
        //fila ordenada
        
        for(int i = 0; i < 93; i++){
            if(frequencia[i] != 0){ //aparece pelo menos uma vez
                NoHuffman no = new NoHuffman((char)(i + 32), frequencia[i]);
                //inserir o no na fila com prioridade
            }
        }
    }
    
    
    
}
