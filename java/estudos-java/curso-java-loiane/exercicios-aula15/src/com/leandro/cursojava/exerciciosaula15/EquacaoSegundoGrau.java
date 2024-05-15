package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A da equação: ");
        int valorA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o valor de B da equação: ");
        int valorB = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o valor de C da equação: ");
        int valorC = scanner.nextInt();
        scanner.nextLine();

        boolean validacao = true;
        double delta = -100;
        double raiz1 = 0;
        double raiz2 = 0;

        if (valorA == 0){
            validacao = false;
            System.out.println("Equação não é do 2ºGrau ");
        }

        if (validacao){
            delta = Math.pow(valorB,2) -4 * valorA * valorC;
        }

        if (validacao && delta < 0){
            System.out.println("Não possui raízes reais");
        }
        if (validacao && delta == 0){
            System.out.println("Possui uma raiz");
            raiz1 = (- valorB) + Math.sqrt(delta)/(2 * valorA);
            System.out.println("Raiz: " + raiz1);
        }
        if (validacao && delta > 0){
            System.out.println("Possui duas raízes");
            raiz1 = ((- valorB) + Math.sqrt(delta))/(2 * valorA);
            raiz2 = ((- valorB) - Math.sqrt(delta))/(2 * valorA);
            System.out.println("Raiz 1 " + raiz1);
            System.out.println("Raiz 2 " + raiz2);
        }

        scanner.close();
    }
}
