package com.example;

import java.util.Scanner;
//import java.util.Arrays;

public class AppPreencherArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fibonacciVet[] = new long[93];
        long fibonacciParcial1 = 0;
        long fibonacciParcial2 = 1;
        long fibonacci = 0;
        int numeroTermosParaFibonnacci;
        int j = 1;
        int contaPosicaoVetor = 0;
        

        System.out.println("Quantos termos para a seguência de Fibonacci? ");
        numeroTermosParaFibonnacci = scanner.nextInt();
        System.out.println();
        System.out.println();
        
        System.out.println("O 1º termo da sequência fibonacci é: " + fibonacci); 
        fibonacciVet[contaPosicaoVetor] = 0;  

        for(int i = 2; i <=numeroTermosParaFibonnacci; i++)
        {
            j++;
            if( j > numeroTermosParaFibonnacci)
            break;
            
            fibonacciParcial1 = fibonacci + fibonacciParcial2; 
            //System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacciParcial1);
            contaPosicaoVetor ++;
            fibonacciVet[contaPosicaoVetor] = fibonacciParcial1;
            System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacciVet[contaPosicaoVetor]); 
            j++;

            if( j > numeroTermosParaFibonnacci)
            break;

            fibonacciParcial2 = fibonacciParcial1 + fibonacci;
            //System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacciParcial2);
            contaPosicaoVetor ++;
            fibonacciVet[contaPosicaoVetor] = fibonacciParcial2;
            System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacciVet[contaPosicaoVetor]); 
            j++;

            if( j > numeroTermosParaFibonnacci)
            break;

            fibonacci = fibonacciParcial1 + fibonacciParcial2; 
            //System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacci);
            contaPosicaoVetor ++;
            fibonacciVet[contaPosicaoVetor] = fibonacci;  
            System.out.println("O "+ j+"º termo da sequência fibonacci é: " + fibonacciVet[contaPosicaoVetor]); 
            
        }

       for(int i = j; i <93; i++)
       {
            fibonacciVet[i]=0;
            //System.out.println(fibonacciVet[i]);   
       }

    }
    
}
