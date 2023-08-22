package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class decoralista 
{

    ArrayList<String> lista = new ArrayList();
    int QtdNomes;
    String imprimeLista;
    String insereNome; 


    public String getInsereNome()
    {  
        String insereOutro = "SIM";
        int QtdNomes=1;
        Scanner scanner = new Scanner(System.in);
        while(insereOutro.equals("SIM"))
        {
            System.out.println("Digite o " + QtdNomes + "º nome: ");
            insereNome = scanner.nextLine();
            lista.add(insereNome);
            QtdNomes++;
            System.out.println("Deseja adicionar outro nome: sim ou não: ");
            insereOutro = scanner.nextLine();   
            insereOutro = insereOutro.toUpperCase(); 
        }
        System.out.println("Foram inseridos " + QtdNomes + " nomes.");
        System.out.println();
     
        return("-------------------------------------------------------------------------------------");
    }


    public String getImprimeLista() 
    {
        Collections.sort(lista);
        for(var nome : lista)
        System.out.println(nome);
        return ("Esta é a lista completa!");
    }
    
    
}
