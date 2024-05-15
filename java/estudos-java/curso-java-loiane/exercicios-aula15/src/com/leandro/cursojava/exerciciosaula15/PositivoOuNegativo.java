package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("O numero " + numero + " é um valor positivo.");
        }else if (numero<0){
            System.out.println("O numero " + numero + " é um valor negativo.");
        } else {
            System.out.println("Valor é zero");
        }

        scanner.close();
    }
}
