/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class NoHuffman {
    
    private char caractere;
    private int frequencia;
    private NoHuffman esq;
    private NoHuffman dir;
    private NoHuffman pai;

    public NoHuffman getEsq() {
        return esq;
    }

    public void setEsq(NoHuffman esq) {
        this.esq = esq;
    }

    public NoHuffman getDir() {
        return dir;
    }

    public void setDir(NoHuffman dir) {
        this.dir = dir;
    }

    public NoHuffman getPai() {
        return pai;
    }

    public void setPai(NoHuffman pai) {
        this.pai = pai;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
    
    
}
