package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        int verificacao = 0;

        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0){
                verificacao++;
            }

        }
        if (verificacao == 2){
            System.out.println("Numero primo");
        }else {
            System.out.println("Não é número primo");
        }

        scanner.close();
    }
}
