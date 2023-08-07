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
            String opcaoFatorar = scanner.nextLine();
            String opcaoFatorarMAIUSCULO = opcaoFatorar.toUpperCase(); 
            
            if (opcaoFatorarMAIUSCULO.equals (referencia))
            {
                System.out.println("Digite Número para fatorar: ");
                int fatorial = scanner.nextInt();
                praticar.setFatorial(fatorial); 
                fatorial = praticar.getFatorial(); 
                System.out.println(fatorial);
            }

            System.out.println(); 
            scanner.nextLine();
            System.out.println("Deseja verificar se um número é multiplo de três? Digite sim ou não");
            String opcaoVerMultiploTres = scanner.nextLine();
            String opcaoVerMultiploTresMAISCULO = opcaoVerMultiploTres.toUpperCase(); 

            if (opcaoVerMultiploTresMAISCULO.equals (referencia))
            {
                System.out.println("Digite Número para verificar se é multiplo ");
                int multiploTres = scanner.nextInt();
                praticar.setVerificaMultiploTres(multiploTres);
                System.out.println(praticar.getMultiploTres());
            }                    

        }
}

