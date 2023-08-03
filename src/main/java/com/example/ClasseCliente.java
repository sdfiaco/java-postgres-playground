package com.example;

class Cliente
   {
    double renda;
    char sexo;
    String segmentoEspecial;
    int anoNascimento;
    boolean especial;
    String nomeDoCliente;
    
    public Cliente(){
        System.out.println("Criando um Cliente");
        renda = 1000;
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
          especial = true;    
          else
           especial = false;
        if (especial == true)
         segmentoEspecial = "Sim";
         else
          segmentoEspecial = "Não";
        segmentoEspecial = segmentoEspecial.toUpperCase();
    }
   }
   public class ClasseCliente {

public static void main(String[] args) {
        //System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        //cliente.renda = -10000;
        cliente.anoNascimento = 1981;
        cliente.sexo = 'F';
        cliente.nomeDoCliente = "Tião Macalé          ";
        if(cliente.renda < 0)
         cliente.renda = 0;
        if(cliente.sexo != 'M')
            if(cliente.sexo != 'F')
            System.out.println(" Digite apenas 'M' ou 'F'");
        
        cliente.nomeDoCliente = cliente.nomeDoCliente.trim().toUpperCase();
        System.out.println("O nome do cliente é: " + cliente.nomeDoCliente);
        System.out.println(" A renda do cliente é:" + cliente.renda);
        System.out.println(" O ano de nascimento do cliente é:" + cliente.anoNascimento);
        System.out.println(" O sexo do cliente é:" + cliente.sexo);
        System.out.println(" O cliente é especial? " + cliente.segmentoEspecial);
        Cliente cliente2 = new Cliente();
        cliente2.renda = 4000;
        cliente2.anoNascimento = 1881;
        cliente2.sexo = 'F';
        cliente2.nomeDoCliente = "Vera Verão         ";
        System.out.println();
        cliente2.nomeDoCliente = cliente2.nomeDoCliente.trim().toUpperCase();
        System.out.println("O nome do cliente é: " + cliente2.nomeDoCliente);
        System.out.println(" A renda do cliente 2 é:" + cliente2.renda);
        System.out.println(" O ano de nascimento do cliente 2 é:" + cliente2.anoNascimento);
        System.out.println(" O sexo do cliente 2 é:" + cliente2.sexo);
        System.out.println(" O cliente é especial? " + cliente2.segmentoEspecial);
    }
    
}
