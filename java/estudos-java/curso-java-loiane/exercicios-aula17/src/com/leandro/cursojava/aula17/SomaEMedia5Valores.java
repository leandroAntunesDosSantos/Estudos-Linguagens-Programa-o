package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class SomaEMedia5Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;

        double soma = 0;

        int contador = 0;

        do {
            contador++;

            System.out.println("Digite uma numero: ");
            numero = scanner.nextDouble();

            soma += numero;

        }while (contador < 5);
        scanner.close();

        System.out.println(soma);
        System.out.println("media " + soma/contador);
    }
}
