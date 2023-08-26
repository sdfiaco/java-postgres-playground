package com.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AppRecordaLista {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        String opcao = "SIM"; 
        String nome;
        
        if(opcao.equals("SIM"))
        {
            int i = 0;
            while(opcao.equals("SIM"))
            {
                System.out.println("Digite o nome a ser incluído: ");
                nome = scanner.nextLine();
                nome = nome.toUpperCase();
                lista.add(nome);
                System.out.println("Deseja inserir outro nome? Digite sim ou não: ");
                opcao = scanner.nextLine();
                opcao = opcao.toUpperCase();
                
                i++;
            }
            System.out.println("Foram inseridos " +i +" nomes.");
            opcao = "SIM";
        }
        System.out.println("Deseja listar os nomes da lista? Digite sim ou não: ");
        opcao = scanner.nextLine();
        opcao = opcao.toUpperCase();
        if(opcao.equals("SIM"))
        {
            Collections.sort(lista);
            for(var item : lista)
            {
                System.err.println(item);
            }

        }
        System.out.println("Deseja retirar um nome da lista? Digite sim ou não.");
        opcao = scanner.nextLine();
        opcao = opcao.toUpperCase();
        if (opcao.equals("SIM"))
        {
            String removeNome = "";
            System.out.println("Digite nome a ser removido: ");
            removeNome = scanner.nextLine();
            removeNome = removeNome.toUpperCase();
            for(var item : lista)
            {
                if(item.equals(removeNome))
                {
                    lista.remove(removeNome);
                    System.out.println("Nome Removido");
                    System.out.println("Deseja visualizar lista após a exclusão? Sim ou não.");
                    opcao = scanner.nextLine();
                    opcao = opcao.toUpperCase();
                    if(opcao.equals("SIM"))
                    {
                        Collections.sort(lista);
                        for(var x : lista)
                        {
                        System.err.println(x);
                        }
                    }
                    break;
                }
            }

        }
        System.out.println("Até breve!");
    }    
    
}
