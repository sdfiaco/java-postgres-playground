package com.example;

import java.util.Scanner;

public class AppCalculadora
{
   
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);      
        float numeroA, numeroB;
        int opcaoParaOperacao;
        calculosMatematicos  calculos = new calculosMatematicos(); 
        String DesejaContinuar = "SIM";
        while(DesejaContinuar.equals("SIM"))
        {
        System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar, 4 para dividir e 5 para verificar se é multiplo: ");
        opcaoParaOperacao = scanner.nextInt();
        if(opcaoParaOperacao == 1)
        {
            System.out.println("Digite o primeiro número para soma: ");
            numeroA = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideA(numeroA);
            System.out.println("Digite o segundo número para soma: ");
            numeroB = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideB(numeroB);
            System.out.println("O resuldado da soma é:" + calculos.getResultadoSoma());
        }
        if(opcaoParaOperacao == 2)
        {
            System.out.println("Digite o primeiro número para subrair: ");
            numeroA = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideA(numeroA);
            System.out.println("Digite o segundo número para subtrair: ");
            numeroB = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideB(numeroB);
            System.out.println("O resuldato da subtração é: " + calculos.getResultadoSubtracao());
        }
        if(opcaoParaOperacao == 3)
        {
            System.out.println("Digite o primeiro número para multiplicar: ");
            numeroA = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideA(numeroA);
            System.out.println("Digite o segundo número para multiplicar: ");
            numeroB = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideB(numeroB);
            System.out.println("O resultado da multiplicação é: " + calculos.getResultadoMultiplicacao());
        }
        if(opcaoParaOperacao == 4)
        {
            System.out.println("Digite o primeiro número para dividir: ");
            numeroA = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideA(numeroA);
            System.out.println("Digite o segundo número para dividir: ");
            numeroB = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideB(numeroB);
            System.out.println("O resultado da divisão é: " + calculos.getResultadoDivisao());
        }
        if(opcaoParaOperacao == 5)
        {
            System.out.println("Digite o número a ser verificado: ");
            numeroA = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideA(numeroA);
            System.out.println("Digite o número denominador: ");
            numeroB = scanner.nextFloat();
            calculos.setSomaOusubtraiOuMultiplicaOuDivideB(numeroB);
            System.out.println(calculos.getEhMultiplo());
        }
        scanner.nextLine();
        System.out.println("Deseja realizar outra operação? Responda sim ou não: ");
        DesejaContinuar = scanner.nextLine();
        DesejaContinuar = DesejaContinuar.toUpperCase();
      }
      System.out.println("Até breve.");
    }
}
       

       


            
              
            
	 
	    
	

        


        