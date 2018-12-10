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
public class QuickSort {
    
    public static void quicksort(ArrayList<Item> A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quicksort(A, p, q);
            quicksort(A, q + 1, r);
        }
    }

    public static int partition(ArrayList<Item> A, int p, int r) {
        double x = A.get(p).getValor(); // pivo
        int i = p;
        int j = r;
        while (true) {
            while (A.get(i).getValor() > x) {
                i++;
            }

            while (A.get(j).getValor() < x) {
                j--;
            }
            
            if (i < j) {
                Collections.swap(A, i, j);
            } else {
                return j;
            }
        }
    }
    
}
