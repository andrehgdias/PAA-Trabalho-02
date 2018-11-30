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
public class Util {
    
    boolean validar(int vetor[], int pessoasDesignadas){
        
        int i, candidato = vetor[pessoasDesignadas - 1];
        
        for(i = 0; i < pessoasDesignadas - 1; i++){
            if(vetor[i] == candidato)
                return false;
        }
        
        return true;
        
    }
    
}
