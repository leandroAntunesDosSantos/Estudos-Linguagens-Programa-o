package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class AnalisandoIdadesDiferentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantas pessoas foram perguntadas as idades: ");
        int quantidade = scanner.nextInt();

        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            soma += idade;
        }

        double media = soma / quantidade;
        if (media > 0 && media <= 25){
            System.out.println("Jovem");
        }
        if (media > 25 && media <= 60){
            System.out.println("adulta");
        }
        if (media > 60){
            System.out.println("idosa");
        }
        
        scanner.close();
    }
}
