package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class OperaçoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite um numero real: ");
        double numero3 = scanner.nextDouble();

        int operacao1 = (numero1 * 2) * (numero2 / 2);
        double operacao2 = (numero1 * 3) + numero3;
        double operacao3 = Math.pow(numero3,3);

        System.out.println(operacao1);
        System.out.println(operacao2);
        System.out.println(operacao3);

    }
}
