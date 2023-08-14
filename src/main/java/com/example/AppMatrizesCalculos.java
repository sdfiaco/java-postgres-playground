package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 

public class AppMatrizesCalculos {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numeroLinhas;
    int numeroColunas;
    Random aleatorio = new Random();
    
    System.out.println("Digite número de linhas para gerar matriz de números aleatórios: ");
    numeroLinhas = scanner.nextInt();
    System.out.println("Digite número de colunas para gerar matriz de números aleatórios: ");
    numeroColunas = scanner.nextInt();
     
    double matrizNumeros [][] = new double [numeroLinhas][numeroColunas];

   
    for(int i=0; i < numeroLinhas; i++){
     for (int j=0; j < numeroColunas; j++)
        matrizNumeros [i][j] = aleatorio.nextDouble(); 
    }
    System.out.println(Arrays.toString(matrizNumeros[0]));
    System.out.println(Arrays.toString(matrizNumeros[1]));
    }
}
