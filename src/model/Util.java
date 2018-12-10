/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author andre
 */
public class Util {

    public static String removerEnter(String msg) {
        String quebraLinha = System.getProperty("line.separator");
        String msgReturn = "";
        for (int i = 0; i < msg.length(); i++) {
            String charAt = Character.toString(msg.charAt(i));
            if(!charAt.contains(quebraLinha)) msgReturn += msg.charAt(i);
        }
        return msgReturn;
    }

    public static boolean isAlpha(String msg) {
        for (int i = 0; i < msg.length(); i++) {
            if (!Character.isAlphabetic(msg.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(String msg) {
        for (int i = 0; i < msg.length(); i++) {
            if (!Character.isDigit(msg.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static char[] stringToArray(String str, int tamanho, boolean charTerminacao){
        char array[] = new char[tamanho];
        int i = 0;
        int j = 0;
        int limite = str.length();
        
        if(charTerminacao){
            array[i] = '\0';
            i++;
            limite++;
        }
        for(; i < limite; i++){
            array[i] = str.charAt(j);
            j++;
        }
        return array;
    }
}
