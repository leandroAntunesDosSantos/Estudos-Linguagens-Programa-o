package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class ValorHComNTermos {  //serie harmonica
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero n que representa a quantidade de termos: ");
        double numero = scanner.nextInt();
        scanner.nextLine();

        double soma = 0;

        for (double i = 1, j = 1; j <=numero ; i=1, j ++) {
            System.out.println(i + "/" + j);
            soma += (i / j);
        }
        System.out.println("Soma = " + soma);
        scanner.close();
    }
}
