package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class CensoTurmaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;

        int registroMenorAluno = 0;
        String nomeMenorAluno = null;
        double menorAluno = 1000;

        int registroMaiorAluno = 0;
        String nomeMaiorAluno = null;
        double maiorAluno = 0;

        while (contador <= 10){
            System.out.println("Digite o nome do aluno");
            String nome = scanner.next();

            System.out.println("Digite a altura do aluno");
            double altura = scanner.nextDouble();

            if (altura < menorAluno){
                registroMenorAluno = contador;
                nomeMenorAluno = nome;
                menorAluno = altura;
            }
            if (altura > maiorAluno){
                registroMaiorAluno = contador;
                nomeMaiorAluno = nome;
                maiorAluno = altura;
            }
            System.out.println("Registro menor aluno: " + registroMenorAluno);
            System.out.println("Nome menor aluno: " + nomeMenorAluno);
            System.out.println("altura menor aluno: " + menorAluno);

            System.out.println("--------------------------");

            System.out.println("Registro maior aluno: " + registroMaiorAluno);
            System.out.println("Nome maior aluno: " + nomeMaiorAluno);
            System.out.println("Altura maior aluno " + maiorAluno);

            contador++;
        }
        scanner.close();
    }
}
