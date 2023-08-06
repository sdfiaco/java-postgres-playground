package com.example;

import java.util.Scanner;

public class Praticar {
    Scanner scanner = new Scanner(System.in);
    int primeiroNumeroIntervalo;
    int ultimoNumeroIntervalo;
    int fatorial;
    int parcialFatorial;
    int tamanhoFatorial;

    public Intervalo()
    {
        System.out.println("Digite o primeiro número do intervalo:");
        primeiroNumeroIntervalo = scanner.nextInt();
        System.out.println("Digite o último número do intervalo:");
        ultimoNumeroIntervalo = scanner.nextInt();
        
        for(int i = primeiroNumeroIntervalo; i<=ultimoNumeroIntervalo ; i++)
        {
            System.out.println(i);
        }

    }

    public CalcFator() 
    {
        
        System.out.println("Digite o número para cálculo do fatorial: ");
        fatorial = scanner.nextInt();
        tamanhoFatorial = fatorial; 
        parcialFatorial = 1;
        for(int i = tamanhoFatorial; i <fatorial; i--)
        {
        parcialFatorial = parcialFatorial * i;
        }
        fatorial = parcialFatorial;

    }
  
}

    

