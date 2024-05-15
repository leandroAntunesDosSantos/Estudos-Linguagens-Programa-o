package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class ExpoenteNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o valor do expoente: ");
        int expoente = scanner.nextInt();

        int resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);

        scanner.close();
    }

}
