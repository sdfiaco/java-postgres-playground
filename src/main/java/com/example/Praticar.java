package com.example;

public class Praticar{

    int fatorial;
    int parcialFatorial = 1; 

    public void setFatorial(int fatorial) {
        this.fatorial = fatorial;
    } 
    
    public int getFatorial() {
        for(int i = fatorial; i>0; i--)
            {
            fatorial = i * parcialFatorial;
            parcialFatorial = fatorial; 
            }
  
        return fatorial;
    }

    
}

    

