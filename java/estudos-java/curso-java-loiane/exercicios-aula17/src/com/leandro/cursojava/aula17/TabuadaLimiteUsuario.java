package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class TabuadaLimiteUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero que você quer a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("digite o numero que começa a tabuada: ");
        int min = scanner.nextInt();

        System.out.println("digite o numero que termina a tabuada: ");
        int max = scanner.nextInt();


        System.out.println("Montar a tabuada de: " + numero);
        System.out.println("Começar por: " + min);
        System.out.println("Terminar em: " + max);

        for (int i = min; i <= max ; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
        scanner.close();
    }
}
