package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class NotasParciaisAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;
        String conceito = null;
        String validacao = null;

        if (media > 9 && media <= 10){
            conceito = "A";
            validacao = "APROVADO(A)";
        }
        if (media > 7.5 && media <= 9){
            conceito = "B";
            validacao = "APROVADO(A)";
        }
        if (media > 6 && media <= 7.5){
            conceito = "C";
            validacao = "APROVADO(A)";
        }

        if (media > 4 && media <= 6){
            conceito = "D";
            validacao = "REPROVADO(A)";
        }
        if (media > 0 && media <= 4){
            conceito = "E";
            validacao = "REPROVADO(A)";
        }

        System.out.println("Notas: " + nota1 + " - " + nota2);
        System.out.println("Média:" + media);
        System.out.println("Conceito: " + conceito);
        System.out.println(validacao);

        scanner.close();
    }
}
