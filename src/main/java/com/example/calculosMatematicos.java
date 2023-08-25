package com.example;

public class calculosMatematicos 
    {
        float somaOusubtraiOuMultiplicaOuDivideA, somaOusubtraiOuMultiplicaOuDivideB, resultadoMultiplicacao, resultadoSoma, resultadoSubtracao, resultadoDivisao;
        String EhMultiplo;
    
        public void setSomaOusubtraiOuMultiplicaOuDivideA(float somaOusubtraiOuMultiplicaOuDivideA)
        {
            this.somaOusubtraiOuMultiplicaOuDivideA = somaOusubtraiOuMultiplicaOuDivideA;
        }
        
        public void setSomaOusubtraiOuMultiplicaOuDivideB(float somaOusubtraiOuMultiplicaOuDivideB)
        {
            this.somaOusubtraiOuMultiplicaOuDivideB = somaOusubtraiOuMultiplicaOuDivideB;
        }
    
        public float getResultadoSoma()
        {
            resultadoSoma = somaOusubtraiOuMultiplicaOuDivideA + somaOusubtraiOuMultiplicaOuDivideB;
            return resultadoSoma;
        }
    
        public float getResultadoSubtracao()
        {
            resultadoSubtracao = somaOusubtraiOuMultiplicaOuDivideA - somaOusubtraiOuMultiplicaOuDivideB;
            return resultadoSubtracao;
        }
    
        public float getResultadoMultiplicacao()
        {
            resultadoMultiplicacao = somaOusubtraiOuMultiplicaOuDivideA * somaOusubtraiOuMultiplicaOuDivideB;
            return resultadoMultiplicacao; 
        }
    
        public float getResultadoDivisao()
        {
            resultadoDivisao = somaOusubtraiOuMultiplicaOuDivideA / somaOusubtraiOuMultiplicaOuDivideB;
            return resultadoDivisao; 
        }
    
        public String getEhMultiplo()
        {
        if(somaOusubtraiOuMultiplicaOuDivideA % somaOusubtraiOuMultiplicaOuDivideB == 0)
            return "É multiplo";
        else
            return "Não é multiplo"; 
        } 
    }
