package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        int x = 10;
        //char textoTeste = 'A';
        System.out.println(x);
        double vetorTeste1[] = {10, 20, 30, 40, 50, 60, 70}; 
        double vetorTeste3[] = new double[5];
        double matrizTeste [] [] = {{10, 20, 30},{40, 50, 60}};
        vetorTeste3[4] = 5;
        vetorTeste3[0] = 100;
        vetorTeste3[1] = 250;
        vetorTeste3[2] = 300;
        vetorTeste3[3] = 254;
        //double vetorTeste2[] = vetorTeste1;
        System.out.println(Arrays.toString(vetorTeste1));
        System.out.println(Arrays.toString(matrizTeste[0]));
        System.out.println(Arrays.toString(matrizTeste[1]));
        matrizTeste [0] = new double[] {10, 25, 45};
        System.out.println(Arrays.toString(matrizTeste[0]));
        System.out.println(Arrays.toString(matrizTeste[1]));
        //System.out.println("Valor da primeira posição: " + vetorTeste1[0]);
        //System.out.println("Valor da segunda posição: " + vetorTeste1[1]);
        //System.out.println(Arrays.toString(vetorTeste3));
        //System.out.println(textoTeste);
        //vetorTeste1[0] = 520.53;
        //System.out.print("valor da primeira posição após alteração:" + vetorTeste1[0]);
    } 
}
