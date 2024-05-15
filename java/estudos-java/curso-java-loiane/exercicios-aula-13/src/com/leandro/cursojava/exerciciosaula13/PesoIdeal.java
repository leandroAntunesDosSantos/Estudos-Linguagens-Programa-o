package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double pesoideal = (72.7 * altura) - 58;

        System.out.println("O seu peso ideal é: " + pesoideal);
    }
}
