package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media == 100){
            System.out.println("Nota " + media + " Aprovado com distinção");
        } else if (media >= 70){
            System.out.println("Nota " + media + " Aprovado");
        } else {
            System.out.println("Nota " + media + " Reprovado");
        }

        scanner.close();
    }
}
