package com.example;
import java.util.Scanner;

public class AppNotepad
{

   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      CalculaPG calculapg = new CalculaPG();
      String opcao;
      
      System.out.println("Gostaria de testar progressão geometrica? Responda sim ou não");
      opcao = scanner.nextLine();
      opcao = opcao.toUpperCase();
      if (opcao.equals("SIM"))
      {	
        System.out.println("Qual multiplo deve ser utilizado para cálculo da PG? ");
        float peso = scanner.nextFloat();
        calculapg.setMultiploParaPG(peso);
        System.out.print("Quantos termos gostaria de listar na PG? ");
        int qtdNumerosPG = scanner.nextInt();
        float vetorNumerosPG[] = new float[qtdNumerosPG];
        float numeroInicial = 1;
        for(int i = 0 ; i<qtdNumerosPG ; i++)
        {
            calculapg.setNumeroInicial(numeroInicial);
            vetorNumerosPG[i] = calculapg.getResultadoMultiplicacao();
            numeroInicial = vetorNumerosPG[i]; 
            System.out.printf(vetorNumerosPG[i] + ", ");
        }
       
      }
   }
}