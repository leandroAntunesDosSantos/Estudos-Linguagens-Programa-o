package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2  = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dos números é: " + soma);
    }
}
