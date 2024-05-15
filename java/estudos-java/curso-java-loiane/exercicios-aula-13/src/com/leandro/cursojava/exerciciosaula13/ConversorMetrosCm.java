package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ConversorMetrosCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em metros(m): ");
        double metros = scanner.nextDouble();

        double conversao = metros * 100;

        System.out.println("O valor em centimetros(cm) é igual a: " + conversao);
    }
}
