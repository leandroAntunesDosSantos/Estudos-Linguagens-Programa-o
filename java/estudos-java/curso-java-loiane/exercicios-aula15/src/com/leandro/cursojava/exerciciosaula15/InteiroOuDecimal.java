package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class InteiroOuDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de um número qualquer: ");
        double numero = scanner.nextDouble();

        if (numero % 1 == 0){
            System.out.println("Numero inteiro");
        }else {
            System.out.println("Numero decimal");
        }
        
        scanner.close();
    }
}
