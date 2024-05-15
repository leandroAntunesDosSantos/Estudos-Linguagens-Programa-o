package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class FatorialFornecidoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero pra calcular o Fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = numero; i > 0 ; i--) {
            fatorial = fatorial * i;

        }
        System.out.println(fatorial);

        scanner.close();
    }
}
