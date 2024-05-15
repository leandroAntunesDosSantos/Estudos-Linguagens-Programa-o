package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Frutaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade(kg) de morangos: ");
        double quantidadeMorangos = scanner.nextDouble();

        System.out.println("Digite a quantidade(kg) de maças: ");
        double quantidadeMacas = scanner.nextDouble();

        double quantidadeTotal = quantidadeMacas + quantidadeMorangos;

        double valorTotalMorango = 0;
        double valorTotalMaca = 0;

        if (quantidadeMorangos > 0 && quantidadeMorangos <= 5){
            valorTotalMorango = 2.5;
        }else {
            valorTotalMorango = 1.8;
        }

        if (quantidadeMacas > 0 && quantidadeMacas <= 5){
            valorTotalMaca = 2.2;
        }else {
            valorTotalMaca = 1.5;
        }

        double valorNormal = (valorTotalMorango * quantidadeMorangos) + (valorTotalMaca * quantidadeMacas);
        double valorComDesconto = valorNormal;

        if (quantidadeTotal > 8 || valorNormal >= 25){
            int desconto = 10;
            valorComDesconto = valorNormal - (valorNormal * desconto)/100;
        }

        System.out.println("Preço do Morango: " + valorTotalMorango);
        System.out.println("Preço da Maçã " + valorTotalMaca);
        System.out.println("Valor normal: " + valorNormal);
        System.out.println("Valor com desconto " + valorComDesconto);

        scanner.close();

    }
}
