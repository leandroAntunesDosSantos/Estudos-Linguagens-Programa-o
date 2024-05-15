package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado,2);
        double areaEmDobro = area * 2;

        System.out.println("A area do quadrado é igual a: " + area);
        System.out.println("O dobro desta area é igual a: " + areaEmDobro);
    }
}
