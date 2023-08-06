package com.example;

class Praticar {
    int fatorial=8;
    int parcialFatorial = 1;

    public Praticar()
    {
        for(int i = fatorial; i>0; i--)
            {
            fatorial = i * parcialFatorial;
            parcialFatorial = fatorial; 
            }
        
    }
    
}

    

