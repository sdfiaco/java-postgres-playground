package com.example;

public class Matematica 
{

    double quadrado;
    int verificaMultiploNove;
    double raiz;
    String MultiploNove;

    public double getQuadrado() {
        quadrado = Math.pow(quadrado, 2);
        return quadrado;
    }
    public void setQuadrado(double quadrado) {
        this.quadrado = quadrado;
    }

    public void setVerificaMultiploNove(int verificaMultiploNove) {
        this.verificaMultiploNove = verificaMultiploNove;
    }

    public String getMultiploNove() {
        if(verificaMultiploNove % 9 == 0)
        return (" é multiplo de 9!");
        else
        return (" não é multiplo de 9!"); 
    } 

    public double getRaiz() {

        raiz = Math.sqrt(raiz);
        return raiz;
    }
    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }
}
    
