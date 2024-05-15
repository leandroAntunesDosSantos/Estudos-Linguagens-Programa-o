package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class ExecucaoVerificarNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite de numeros para verificar se é primo: ");
        int numero = scanner.nextInt();

        int valorInicial = 2;

        for (int i = numero; i >= valorInicial  ; i--) {
            boolean primo = true;

            for (int j = i - 1; j >= valorInicial; j--) {
                if (i % j == 0){
                    System.out.println(i + "/" + j + " = " + (i / j) + " Não é primo ");
                    primo = false;
                }
            }

            if (primo){
                System.out.println(i + " Numero primo");
            }

        }

        scanner.close();

    }
}
