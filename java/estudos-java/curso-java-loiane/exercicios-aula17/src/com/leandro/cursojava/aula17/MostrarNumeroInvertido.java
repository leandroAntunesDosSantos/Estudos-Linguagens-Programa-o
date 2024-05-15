package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class MostrarNumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = numero; i > 0 ; i--) {
            System.out.printf(i + ",");
        }

        scanner.close();

    }
}
