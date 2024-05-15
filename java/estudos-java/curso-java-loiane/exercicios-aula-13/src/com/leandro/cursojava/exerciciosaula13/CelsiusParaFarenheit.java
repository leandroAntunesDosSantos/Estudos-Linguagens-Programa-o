package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class CelsiusParaFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em graus Celsius(ºC) ");
        double celsius = scanner.nextDouble();

        double conversorFarenheit = (1.8 * celsius) + 32;

        System.out.println("A temperatura em Farenheit é igual a: " + conversorFarenheit);
    }
}
