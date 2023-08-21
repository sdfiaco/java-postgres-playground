package com.example;
import java.util.Scanner;

public class AppMatematica {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Matematica matematica = new Matematica();
        double quadrado, raiz;
        int verificaMultiploNove; 
        System.out.println("Digite número para elevar ao quadrao: ");
        quadrado = scanner.nextDouble();
        System.out.println("Digite número para cálculo da raíz quadrada: ");
        raiz = scanner.nextDouble();
        System.out.println("Digite número para verificar se é múltipo de nove: ");
        verificaMultiploNove = scanner.nextInt();
        matematica.setQuadrado(quadrado);
        matematica.setRaiz(raiz);
        matematica.setVerificaMultiploNove(verificaMultiploNove);
        System.out.println("O número " + quadrado + " elevado ao quadrado é: " + matematica.getQuadrado());
        System.out.println("A raíz quadrada do número " + raiz + " é " + matematica.getRaiz());
        System.out.println("O número " + verificaMultiploNove + matematica.getMultiploNove());

    }
    
}
