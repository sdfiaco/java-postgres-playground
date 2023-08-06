package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {
        //Cliente vetorClientes[] = new Cliente[5] ; 
        List<Cliente> listaClientes = new ArrayList<>();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();

        cliente1.nomeDoCliente = "Silvério Del Fiaco";
        cliente2.nomeDoCliente = "Biel Del Fiacco";
        cliente3.nomeDoCliente = "Kiko Del Fiaco";
        cliente4.nomeDoCliente = "Letisa Dalla Nora";
        cliente5.nomeDoCliente = "Shadown";
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        for (var cliente : listaClientes) {
            System.err.println(cliente);
        }

        //System.out.println(listaClientes);


       // System.out.println(cliente1.nomeDoCliente);
       // System.out.println(cliente2.nomeDoCliente);
       // System.out.println(cliente3.nomeDoCliente);
       // System.out.println(cliente4.nomeDoCliente);
        // System.out.println(cliente5.nomeDoCliente);
        
    }
    
}
