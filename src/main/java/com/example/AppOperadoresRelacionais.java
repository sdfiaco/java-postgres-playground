package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();
    cliente1.anoNascimento = 1980;
    cliente1.renda = 589.6;
    cliente2.anoNascimento = 1975;
    cliente2.renda = 789.5;
    if (cliente1.renda > cliente2.renda) {
        System.out.println("Renda do Cliente 1 é maior");}
        else{
         System.out.println("Renda do Cliente 2 é maior");}

    System.out.println(cliente2.renda);
    System.out.println(cliente1.renda);
    System.out.println(cliente1.anoNascimento);
    System.out.println(cliente2.anoNascimento);

    }
    
}
