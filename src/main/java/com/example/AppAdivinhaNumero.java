package com.example;

import java.util.Scanner;

public class AppAdivinhaNumero {

    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);  
    AdivinharNumero adivinharNumero = new AdivinharNumero(); 

    System.out.println("Digite um numero entre 1 e 5.000.000 para o computador adivinhar: ");
    int qualNumero = scanner.nextInt();
    adivinharNumero.setNumeroParaAdivinhar(qualNumero);
    int contaTentativas = adivinharNumero.getContaPalpite(); 
    System.out.println("O computador acertou em " + contaTentativas + " tentativas");

    System.out.println("Agora é sua vez de brincar. Tente adivinhar um número entre 0 e 100: ");
    int paraEuAdivinhar = scanner.nextInt();
    adivinharNumero.setQueroAdivinhar(paraEuAdivinhar); 
    int j = adivinharNumero.getQueroAdivinhar(); 
     
    System.out.println("Você acertou em " + j + " tentativas. Até logo!!!");
    }
}
