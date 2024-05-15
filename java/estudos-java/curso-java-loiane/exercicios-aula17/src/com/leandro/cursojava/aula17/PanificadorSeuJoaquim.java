package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class PanificadorSeuJoaquim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos pães foram comprados: ");
        int quantidade = scanner.nextInt();

        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += 0.18;
        }

        System.out.println(quantidade + "- R$ " + soma);

        scanner.close();
    }
}
