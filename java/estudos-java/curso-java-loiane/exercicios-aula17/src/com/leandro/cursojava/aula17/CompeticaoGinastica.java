package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class CompeticaoGinastica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos atletas participarão da competição: ");
        int participantes = scanner.nextInt();

        int contador = 0;

        String nome;

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;
        double nota6 = 0;
        double nota7 = 0;

        double menorNota = 100;
        double maiorNota = 0;
        double somaDasNotas = 0;

        do {
            System.out.println("Digite o nome da atleta");
            nome = scanner.next();

            for (int i = 0; i < 7; i++) {
                System.out.println("Digite a nota da Atleta: ");
                double nota = scanner.nextDouble();

                if (i == 0){
                    nota1 = nota;
                }
                if (i == 1){
                    nota2 = nota;
                }
                if (i == 2){
                    nota3 = nota;
                }
                if (i == 3){
                    nota4 = nota;
                }
                if (i == 4){
                    nota5 = nota;
                }
                if (i == 6){
                    nota6 = nota;
                }
                if (i == 6){
                    nota7 = nota;
                }

                if (nota < menorNota){
                    menorNota = nota;
                }
                if (nota > maiorNota){
                    maiorNota = nota;
                }
                somaDasNotas += nota;
            }
            System.out.println("Atleta: " + nome);
            System.out.println("Nota: " + nota1);
            System.out.println("Nota: " + nota2);
            System.out.println("Nota: " + nota3);
            System.out.println("Nota: " + nota4);
            System.out.println("Nota: " + nota5);
            System.out.println("Nota: " + nota6);
            System.out.println("Nota: " + nota7);

            System.out.println("Maior Nota: " + maiorNota);
            System.out.println("Menor Nota: " + menorNota);
            System.out.println("Media das notas: " + (somaDasNotas - maiorNota - menorNota)/5);


            menorNota = 100;
            maiorNota = 0;
            somaDasNotas = 0;

            contador++;
        }while (contador < participantes);
        scanner.close();
    }
}
