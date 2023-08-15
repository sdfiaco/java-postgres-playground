package com.example;

import java.util.Random;
import java.util.Scanner;

class AdivinharNumero {

int numeroParaAdivinhar;
int queroAdivinhar;
Scanner scanner = new Scanner(System.in); 

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



public void setQueroAdivinhar(int queroAdivinhar) {
    this.queroAdivinhar = queroAdivinhar;
}

public int getQueroAdivinhar() {
    int paraAdivnhar = aleatorio.nextInt(101); 
    int i = i;
    if (queroAdivinhar == paraAdivnhar) 
       return i; 
       else
        while(paraAdivnhar != queroAdivinhar)
        {
            if (queroAdivinhar > paraAdivnhar)
               {
               System.out.println("O número escolhido é menor. Tente novamente");
               queroAdivinhar = scanner.nextInt();
               } 
            else {
                System.out.println("O número escolhido é maior. Tente novamente");
                queroAdivinhar = scanner.nextInt(); 
            }
            i ++; 
     
        }

    }
    
    return i; 
}

} 


    

