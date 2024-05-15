package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class DeterminarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se é primo ");
        int numero = scanner.nextInt();

        boolean primo = true;

        for (int i = 2; i <numero ; i++) {
            if (numero % i == 0){
                System.out.println("nao é primo");
                primo = false;
            }
        }

        if (primo){
            System.out.println("é primo");
        }

        scanner.close();
    }
}
