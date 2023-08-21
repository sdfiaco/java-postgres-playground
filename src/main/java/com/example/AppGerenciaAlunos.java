package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class AppGerenciaAlunos {

public static void main(String[] args) 

{

    Scanner scanner = new Scanner(System.in);
    int numeroMaximoAlunosTurma = 6;
    String insereAluno;
    String alunosTurma[][] = new String [numeroMaximoAlunosTurma][6]; 
    alunosTurma[0][0] = "Nome";
    alunosTurma[0][1] = "Matemática";
    alunosTurma[0][2] = "Português";
    alunosTurma[0][3] = "Ciências";
    alunosTurma[0][4] = "Geografia";
    alunosTurma[0][5] = "História";
    int contAluno = 1;

    System.out.println("Deseja Cadastrar Aluno? ");
    insereAluno = scanner.nextLine();

    if (insereAluno.equals("SIM"))
    {
        while(insereAluno.equals("SIM") && contAluno<numeroMaximoAlunosTurma)
        {
            
            //scanner.nextLine();
            System.out.println("Digite o nome do aluno a ser inserido: ");
            alunosTurma[contAluno][0] = scanner.nextLine();
            contAluno++; 
            //System.out.println(alunosTurma[contAluno][0]); 
            for (int i=0; i<6; i++)
            {
                System.out.println("Digite a nota da disciplina");
                alunosTurma[contAluno][i] = scanner.nextLine();
            }
            //contAluno++; 
            System.out.println("Deseja inserir outro aluno? ");
            insereAluno = scanner.nextLine();
        }    
    }

    for(int i=0; i<contAluno; i++)
    {
        for(int j = 0; j<6; j++)
        {
            System.out.printf(alunosTurma[i][j]);
            System.out.println();
        }
    }
    

}

} 





