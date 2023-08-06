package com.example;

import java.util.Scanner;

public class Praticar {
    int primeiroNumeroIntervalo;
    int ultimoNumeroIntervalo;
    int somaAcumulada;
    double achaMultiplo3;
    long fatorial;
    char multiplo3;

    public static void main(String[] args) {
     Praticar teste1 = new Praticar();
     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número do intervalo:");
        teste1.primeiroNumeroIntervalo = scanner.nextInt();
        System.out.println("Digite o último número do intervalo:");
        teste1.ultimoNumeroIntervalo = scanner.nextInt();
        
        for(int i = teste1.primeiroNumeroIntervalo; i<=teste1.ultimoNumeroIntervalo ; i++){
            System.out.println(i);
        }

    }

        




    
}
