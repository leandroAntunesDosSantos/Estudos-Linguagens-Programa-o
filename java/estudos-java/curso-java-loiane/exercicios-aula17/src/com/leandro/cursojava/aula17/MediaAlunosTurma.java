package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class MediaAlunosTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas turmas existem?");
        int turma = scanner.nextInt();

        double soma = 0;
        boolean validate = true;
        int contador = 0;

        do {
            contador ++;
                System.out.println("Quantos alunos tem essa turma? ");
                int alunos = scanner.nextInt();

                if (alunos > 40){
                    validate = false;
                    System.out.println("As turmas nao podem ter mais de 40 alunos ");
                }
                soma += alunos;

        }while ((contador < turma) && validate);

        double media = soma / turma;
        if (validate){
            System.out.println("Média de alunos " + media);
        }

        scanner.close();
    }
}
