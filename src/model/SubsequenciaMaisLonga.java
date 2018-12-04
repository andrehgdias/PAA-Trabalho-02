/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thale
 */
public class SubsequenciaMaisLonga {
    
    //Preenchendo as tabelas contidas nas matrizes B e C
    public static void constroiTabelas(char X[], char Y[], char B[][], int C[][], int i, int j, int armazenaIeJ[]) {
        
        //inicializando as posição da linha 0 e da coluna 0 com o valor 0
        for( ; i < X.length; i++) {
            C[i][0] = 0;
        }
        for( ; j < Y.length; j++) {
            C[0][j] = 0;
        }
        
        //preenchendo o restante da tabela de acordo com a comparação dos valores contidos em X e Y
        for(i = 1; i < X.length; i++) {
            for(j = 1; j < Y.length; j++) {
                if(X[i] == Y[j]) {
                    C[i][j] = C[i-1][j-1] + 1;
                    B[i][j] = '\\';	//duplo contra-barra para representar o caminho diagonal pra esquerda
                } else if(C[i-1][j] >= C[i][j-1]) {
                    C[i][j] = C[i-1][j];
                    B[i][j] = '|';  //representação do caminho para cima
                } else {
                    C[i][j] = C[i][j-1];
                    B[i][j] = '_';  //representação do caminho para a esquerda
                }
            }
        }
        
        //copiando os valores de i e j para o vetor, para que esses valores sejam utilizados no método imprimeSolucao()
        armazenaIeJ[0] = i;
        armazenaIeJ[1] = j;
        
    }
   
    //Imprimindo a Subsequência Comum Mais Longa
    public static void imprimeSolucao(char B[][], char X[], int i, int j) {
        
        if(i == 0 || j == 0)
            return;	//a posição possui nada armazenado nela
        
        switch (B[i][j]) {
            case '\\':
                //duplo contra-barra para representar o caminho diagonal pra esquerda
                imprimeSolucao(B,X,i-1,j-1);
                System.out.println(X[i]);
                break;
                
            case '|':
                //representação do caminho para cima
                imprimeSolucao(B,X,i-1,j);
                break;
                
            case '_':
                //representação do caminho para a esquerda
                imprimeSolucao(B,X,i,j-1);
                break;
        }

    }
    
}
