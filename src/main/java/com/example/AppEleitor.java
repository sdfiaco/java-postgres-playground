package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args){
     //var cidadao = new Cidadao();
     Cidadao cidadao = new Cidadao();
     cidadao.setDataNascimento(LocalDate.of(2017, 04, 19));
     System.out.println(cidadao.idade());
     System.out.println(cidadao.eleitor());

    }
}
