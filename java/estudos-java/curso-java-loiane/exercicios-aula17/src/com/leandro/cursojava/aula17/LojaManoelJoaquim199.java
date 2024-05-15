package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class LojaManoelJoaquim199 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos itens a pessoa comprou: ");
        int quantidade = scanner.nextInt();

        double soma = 0;

        for (int i = 0; i < quantidade ; i++) {
            soma += 1.99;
        }
        System.out.println(quantidade + "- R$ " + soma);

        scanner.close();
    }
}
