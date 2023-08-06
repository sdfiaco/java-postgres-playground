package com.example;

public class AppPraticar 
{
        public static void main(String[] args) 
        {
            int fatorial = 10;
            int parcialFatorial = 1;
            for(int i = fatorial; i>0; i--)
            {
            fatorial = i * parcialFatorial;
            parcialFatorial = fatorial; 
            }
            System.out.println(fatorial);

        }
}