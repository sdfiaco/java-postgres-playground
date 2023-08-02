package com.example;

class Cliente
   {
    double renda;
    char sexo;
    int anoNascimento;
   }
   public class ClasseCliente {

public static void main(String[] args) {
        System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        cliente.renda = 10000;
        cliente.anoNascimento = 1981;
        cliente.sexo = 'F';
        if(cliente.renda < 0)
         cliente.renda = 0;
        if(cliente.sexo != 'M')
            if(cliente.sexo != 'F')
            System.out.println(" Digite apenas 'M' ou 'F'");
        System.out.println(" A renda do cliente é:" + cliente.renda);
        System.out.println(" O ano de nascimento do cliente é:" + cliente.anoNascimento);
        System.out.println(" O sexo do cliente é:" + cliente.sexo);
        Cliente cliente2 = new Cliente();
        cliente2.renda = 2000;
        cliente2.anoNascimento = 1981;
        cliente2.sexo = 'F';
        System.out.println();
        System.out.println(" A renda do cliente 2 é:" + cliente2.renda);
        System.out.println(" O ano de nascimento do cliente 2 é:" + cliente2.anoNascimento);
        System.out.println(" O sexo do cliente 2 é:" + cliente2.sexo);
    }
    
}
