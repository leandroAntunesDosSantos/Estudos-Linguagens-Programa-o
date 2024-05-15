package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class SerieHrmonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero n da serie harmonica: ");
        double numero = scanner.nextDouble();
        scanner.nextLine();

        double soma = 0;

        for (double i = 1, j = 1; j <= numero ; i = 1, j ++) {
            System.out.println(i + "/" + j);
            soma += (i / j);

        }
        System.out.println("Soma " + soma);
        
        scanner.close();
    }
}
