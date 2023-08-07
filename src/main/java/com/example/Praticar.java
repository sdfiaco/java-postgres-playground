package com.example;

public class Praticar{

    int fatorial;
    int parcialFatorial = 1; 
    int verificaMultiploTres;
    int restoDivisaoPorTres; 
    String multiploTres; 

    public String getMultiploTres() {
        restoDivisaoPorTres = verificaMultiploTres % 3;
        if(restoDivisaoPorTres == 0)
        return ("É múltiplo de Três!");
        else
        return ("Não é Multiplo de Três!");
    }

    public void setVerificaMultiploTres(int verificaMultiploTres) {
        this.verificaMultiploTres = verificaMultiploTres;
    }

    
    public int getFatorial() {
        for(int i = fatorial; i>0; i--)
            {
            fatorial = i * parcialFatorial;
            parcialFatorial = fatorial; 
            }
  
        return fatorial;
    }

    public void setFatorial(int fatorial) {
        this.fatorial = fatorial;
    } 
}

    

