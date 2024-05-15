package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio,2);
        System.out.println(area);
    }
}
