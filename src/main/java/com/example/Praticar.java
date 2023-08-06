package com.example;

import java.util.Scanner;

class Praticar {
    Scanner scanner = new Scanner(System.in);
    int primeiroNumeroIntervalo;
    int ultimoNumeroIntervalo;
    int fatorial;
    int parcialFatorial;
    int tamanhoFatorial;
    int numeroParcial;

    public Intervalo()
    {
        //System.out.println("Digite o primeiro número do intervalo:");
        //primeiroNumeroIntervalo = scanner.nextInt();
        //System.out.println("Digite o último número do intervalo:");
        //ultimoNumeroIntervalo = scanner.nextInt();
        
        for(int i = primeiroNumeroIntervalo; i<=ultimoNumeroIntervalo ; i++)
        {
            numeroParcial = i;
            System.out.println(numeroParcial);
        }

    }

    public CalcFator()
    {
        //System.out.println("Digite o número para cálculo do fatorial: ");
        //fatorial = scanner.nextInt();
        tamanhoFatorial = fatorial; 
        
        for(int i = tamanhoFatorial; i <fatorial; i--)
        {
        parcialFatorial = parcialFatorial * i;
        }
        fatorial = parcialFatorial;

    }
  
}

    

