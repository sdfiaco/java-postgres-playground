package com.example;

import java.util.Scanner;

class Praticar {
    int fatorial;
    int parcialFatorial = 1;
    Scanner scanner = new Scanner(System.in);

    public Praticar()
    {
        for(int i = fatorial; i>0; i--)
            {
            fatorial = i * parcialFatorial;
            parcialFatorial = fatorial; 
            }

    }
    
}

    

