package com.example;

import java.util.Scanner;

public class AppScanner {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        System.out.println();
        System.out.println("Informe sua renda: ");
        double renda = scanner.nextDouble();
        System.out.println();
        System.out.println("Informe seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Informe seu sexo: ");
        String sexo = scanner.nextLine();

        //if(renda < 0)
         //renda = 0;
       // if(sexo != 'M')
            //if(sexo != 'F')
            //System.out.println(" Digite apenas 'M' ou 'F'");
        System.out.println("O nome do cliente é: " + nomeCliente);
        System.out.println(" A renda do cliente é:" + renda);
        System.out.println(" O ano de nascimento do cliente é:" + anoNascimento);
        System.out.println(" O sexo do cliente é:" + sexo);

        
    }
    
}
