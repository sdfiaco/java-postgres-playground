package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppListas {
    public static void main(String[] args) {
        
        ArrayList<String> clienteList = new ArrayList<String>(); 
        Scanner scanner = new Scanner(System.in); 
        String nomeCliente;
        String referencia = "SIM";
        String opcaoCliente = "SIM";
        //String opcaoClienteMudaCaixa;

        while (opcaoCliente.equals (referencia))
        {
            System.out.println("Digite nome de cliente para ser adicionado à lista: ");
            nomeCliente = scanner.nextLine(); 
            clienteList.add(nomeCliente);
            System.out.println("Deseja adicionar outro nome? Responda 'sim' ou 'não'.");
            opcaoCliente = scanner.nextLine();
            opcaoCliente = opcaoCliente.toUpperCase(); 
        }

        Collections.sort(clienteList);
        
        for (var cliente : clienteList) {
            System.err.println(cliente);
        }

        
    }
    
}
