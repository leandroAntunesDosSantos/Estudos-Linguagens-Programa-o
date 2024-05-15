package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class MasculinoOuFeminino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o caractere F ou M: ");
        String caractere = scanner.nextLine();

        if (caractere.equals("F") || caractere.equals("f")){
            System.out.println("F - Feminino");
        } else if (caractere.equals("M") || caractere.equals("m")){
            System.out.println("M - Masculino");
        }else {
            System.out.println("Sexo Inválido");
        }

        scanner.close();
    }
}
