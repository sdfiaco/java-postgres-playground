package com.example;

import java.util.Scanner;

public class AppPraticar 
{
        public static void main(String[] args) 
        {
            Scanner scanner = new Scanner(System.in);
            Praticar praticar = new Praticar();
            String referencia = "SIM";
            int numeroParaFatorar;
            System.out.println("Deseja cálcular o fatorial de um número? Digite sim ou não"); 
            String opcaoFatorial= scanner.nextLine();
            
            if (opcaoFatorial.equals (referencia))
            {
                System.out.println("Digite o número para cálculo do fatorial");
                numeroParaFatorar = scanner.nextInt();
                praticar.fatorial = numeroParaFatorar; 
                System.out.println(praticar.parcialFatorial);
            }
                else
                  System.out.println("Não foi. Pq será?");

        }
}