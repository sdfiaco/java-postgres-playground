package com.example;

import java.util.Scanner;

public class AppPreencherArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int vetor fibonacciVet[] = new int[20];
        long fibonacciParcial1 = 0;
        long fibonacciParcial2 = 1;
        long fibonacci = 0;
        int numeroTermosParaFibonnacci;
        int j = 1;

        System.out.println("Quantos termos para a seguência de Fibonacci? ");
        numeroTermosParaFibonnacci = scanner.nextInt();
        System.out.println();
        System.out.println();
        
        System.out.println("O 1º termo da sequência fibonacci é: " + fibonacci); 

        for(int i = 2; i <=numeroTermosParaFibonnacci; i++)
        {
            j++;
            if( j > numeroTermosParaFibonnacci)
            break;
            
            fibonacciParcial1 = fibonacci + fibonacciParcial2; 
            System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacciParcial1);
            j++;
            if( j > numeroTermosParaFibonnacci)
            break;

            fibonacciParcial2 = fibonacciParcial1 + fibonacci;
            System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacciParcial2);
            j++;
            if( j > numeroTermosParaFibonnacci)
            break;

            fibonacci = fibonacciParcial1 + fibonacciParcial2; 
            System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacci);
            
        }

    }
    
}
