package com.example;

public class Matrizes {
 int linha;
 int coluna;
 
 
    public void setLinha(int linha) {
        this.linha = linha;
    }
    
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }


    public double[][] getMatrizNumeros() {
    
        double matrizNumeros [][] = new double [linha][coluna];
   
        for(int i=0; i < linha; i++){
            for (int j=0; j< coluna; j++)
                double matrizNumeros [i][j] = Math.random();
        }
        
        return matrizNumeros;

    }

    
}










    
    
}
