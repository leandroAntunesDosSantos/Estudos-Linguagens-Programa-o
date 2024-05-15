package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o enesimo termo do fibonacci: ");
        int n = scanner.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        for (int i = 3; i <= n ; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println(proximo);
        }

        scanner.close();
    }
}
