package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class OrdemDecrescenteNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        }
        if (num2 > num1 && num2 > num3){
            System.out.println(num2);
        }
        if (num3 > num1 && num3 > num2){
            System.out.println(num3);
        }

        if (num1 > num2 && num1 < num3){
            System.out.println(num1);
        }
        if (num2 > num1 && num2 < num3){
            System.out.println(num2);
        }

        if (num3 > num1 && num3 < num2){
            System.out.println(num3);
        }

        if (num1 < num2 && num1 < num3){
            System.out.println(num1);
        }
        if (num2 < num1 && num2 < num3){
            System.out.println(num2);
        }

        if (num3 < num1 && num3 < num2){
            System.out.println(num3);
        }

        scanner.close();

    }
}
