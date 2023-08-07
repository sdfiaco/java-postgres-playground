package com.example;

import java.util.Scanner;

public class AppPraticar 
{
        public static void main(String[] args) 
        {
            Scanner scanner = new Scanner(System.in);
            Praticar praticar = new Praticar();
            String referencia = "SIM";
            System.out.println("Deseja cálcular o fatorial de um número? Digite sim ou não"); 
            String opcaoFatorial= scanner.nextLine();
            
            if (opcaoFatorial.equals (referencia))
            {
                System.out.println("Digite Número para fatorar: ");
                int fatorial = scanner.nextInt();
                praticar.setFatorial(fatorial); 
                fatorial = praticar.getFatorial(); 
                System.out.println(fatorial); S
            }
                else
                  System.out.println("Não foi. Pq será?");

        }
}