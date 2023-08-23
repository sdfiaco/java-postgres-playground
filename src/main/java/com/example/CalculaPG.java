package com.example;

public class CalculaPG
{
   float multiploParaPG;
   float resultadoMultiplicacao;
   float numeroInicial;

   
    public void setMultiploParaPG(float multiploParaPG) {
        this.multiploParaPG = multiploParaPG;
    }


    public void setNumeroInicial(float numeroInicial) {
        this.numeroInicial = numeroInicial;
    }


    public float getResultadoMultiplicacao() {
        resultadoMultiplicacao = numeroInicial * (1 + multiploParaPG);
        return resultadoMultiplicacao;
    }

}
   


   
     