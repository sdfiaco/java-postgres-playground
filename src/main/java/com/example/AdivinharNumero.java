package com.example;

import java.util.Random;

class AdivinharNumero {

int numeroParaAdivinhar;


Random aleatorio = new Random();

public void setNumeroParaAdivinhar(int numeroParaAdivinhar) {
    this.numeroParaAdivinhar = numeroParaAdivinhar;
}

public int getContaPalpite() {
    int contaPalpite = 1;
    int palpite =  aleatorio.nextInt(5000001); 
    while(numeroParaAdivinhar != palpite)
    {
        palpite =  aleatorio.nextInt(5000001); 
        contaPalpite ++; 
    }
    return contaPalpite;
}



} 


    

