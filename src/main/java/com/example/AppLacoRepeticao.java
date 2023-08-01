package com.example;

import java.util.Arrays;

public class AppLacoRepeticao {
    public static void main(String[] args)
    {
        int vetor3[] = new int[5];
        double matriz[][] = new double[2][3];
        
        for (int index = 0; index < matriz.length; index++) {
            for (int j = 0; j < matriz[index].length; j++) {
             matriz[index][j] = (index * matriz[index].length + j + 1) *10 ;
            } 
         }
        
        for (int index = 0; index < vetor3.length; index++) {
           vetor3[index] = 100 * (index + 1); 
            
        }
        System.out.println(Arrays.toString(vetor3));
        System.out.println();
        //double matriz[][] = {{10, 20, 30} , {40, 50, 60}};
        System.out.print(Arrays.toString(matriz[0]));
        System.out.println();
        System.out.print(Arrays.toString(matriz[1]));

    }

    
}
