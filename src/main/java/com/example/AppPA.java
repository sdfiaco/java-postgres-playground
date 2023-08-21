package com.example;
import java.util.Scanner;

public class AppPA 
{

    public static void main(String[] args)
    {
        int numeroTermos;
        double incremento; 
        double totalParcial = 1;
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Vamos escrever uma PA? Digite o número de termos: ");
        numeroTermos = scanner.nextInt();
        System.out.println("Qual será o valor incremental da PA?");
        incremento = scanner.nextDouble(); 
        System.out.println();
        double vetorPA[] = new double[numeroTermos];
        for(int i=0; i<numeroTermos; i++)
        {
            vetorPA[i]= totalParcial;
            totalParcial = totalParcial + incremento;
            System.out.printf(vetorPA[i] + ", ");
        }

    }
    
}
