package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class ComparaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if(numero1 >= numero2){
            System.out.println("Maior numero é: " +numero1);
        }else {
            System.out.println("Maior numero é: " + numero2);
        }

        scanner.close();
    }

}
