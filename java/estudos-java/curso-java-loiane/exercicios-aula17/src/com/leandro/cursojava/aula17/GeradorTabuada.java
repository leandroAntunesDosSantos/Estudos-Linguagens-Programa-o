package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero que você quer a tabuada: ");
        int numero = scanner.nextInt();

        int quantidadeValores = 10;

        for (int i = 1; i <= quantidadeValores ; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }

        scanner.close();
    }
}
