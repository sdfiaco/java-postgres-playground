package com.example;


class Praticar {
    int fatorial;
    int parcialFatorial = 1;
    int tamanhoFatorial;

    public Praticar()
    {
        for(int i = tamanhoFatorial; i>0; i--)
        {
        fatorial = i * parcialFatorial;
        parcialFatorial = fatorial; 
        }
        //fatorial = parcialFatorial;

    }
  
}

    

