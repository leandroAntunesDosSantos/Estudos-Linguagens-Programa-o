package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class FarenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em Farenheit(F): ");
        double tempFarenheit = scanner.nextDouble();

        double conversorCelsius = (5*(tempFarenheit-32)/9);

        System.out.println("A temperatura em Celsius é igual a: " + conversorCelsius);
    }
}
