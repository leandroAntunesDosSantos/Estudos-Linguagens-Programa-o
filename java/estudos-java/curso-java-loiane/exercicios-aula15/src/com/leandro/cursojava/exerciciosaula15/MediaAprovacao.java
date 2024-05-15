package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class MediaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        if (media == 10){
            System.out.println("Aprovado com distinção");
            System.out.println("Media: " + media);
        }
        if (media < 10 && media >= 7){
            System.out.println("aprovado");
            System.out.println("Media: " + media);
        }
        if (media < 7){
            System.out.println("Reprovado");
            System.out.println("Media: " + media);
        }

        scanner.close();

    }
}
