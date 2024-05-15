package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class TermosSerieNSobreM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero n da serie: ");
        int numero = scanner.nextInt();

        double soma = 0;

        for (int n = 1, m = 1; n <= numero ; n++,m+=2) {
            System.out.print( n + "/"  + m + " + ");
            soma += (n / m);
        }
        System.out.println("Soma = " + soma);
        scanner.close();
    }
}
