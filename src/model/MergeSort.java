/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thale
 */
public class MergeSort {
    
    private ArrayList<Item> entrada;
     
    public ArrayList<Item> getArrayOrdenado() {
        return entrada;
    }
 
    public MergeSort(ArrayList<Item> inputArray){
        this.entrada = inputArray;
    }
     
    public void ordenarArray(){       
        mergeSort(0, this.entrada.size() - 1);
    }
     
    public void mergeSort(int comeco,int fim){
        if(comeco<fim && (fim-comeco) >= 1){
            int meio = (fim + comeco)/2;
            mergeSort(comeco, meio);
            mergeSort(meio+1, fim);        
             
            merge(comeco,meio,fim);            
        }       
    }   
     
    public void merge(int comeco, int meio, int fim){
         
        ArrayList<Item> arrayOrdenado = new ArrayList<>();
         
        int esquerda = comeco;
        int direita = meio + 1;
         
        while(esquerda <= meio && direita <= fim){
            if(entrada.get(esquerda).getValor() > entrada.get(direita).getValor()){
                arrayOrdenado.add(entrada.get(esquerda));
                esquerda++;
            }else{
                arrayOrdenado.add(entrada.get(direita));
                direita++;
            }
        }       
         
        while(esquerda <= meio){
            arrayOrdenado.add(entrada.get(esquerda));
            esquerda++;
        }
         
        while(direita <= fim){
            arrayOrdenado.add(entrada.get(direita));
            direita++;
        }
         
        int i = 0;
        int j = comeco;
        
        while(i < arrayOrdenado.size()){
            entrada.set(j, arrayOrdenado.get(i++));
            j++;
        }
        
    }
    
}
