package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano a ser consultado: ");
        int ano = scanner.nextInt();

        if (ano % 400 == 0){
            System.out.println("Ano bissexto");
        } else if (ano % 4 == 0 && ano % 100 != 0){
            System.out.println("Ano bissexto");
        }else {
            System.out.println("Nao é bissexto");
        }
        
        scanner.close();
    }
}
