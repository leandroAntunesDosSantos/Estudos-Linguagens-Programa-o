package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class PostoDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos litros de combustível forma vendidos? ");
        double litros = scanner.nextDouble();

        System.out.println("Qual o tipo de combustível? ");
        String tipoCombustivel = scanner.next();

        double precoGasolina = 2.50;

        double precoAlcool = 1.90;

        double formula = 0;


        if (tipoCombustivel.equals("g") && litros <= 20){
            int porcentagemDesconto = 4;
            formula = precoGasolina * litros - ((precoGasolina * litros) * porcentagemDesconto / 100);
        }

        if (tipoCombustivel.equals("g") && litros > 20){
            int porcentagemDesconto = 6;
            formula = precoGasolina * litros - ((precoGasolina * litros) * porcentagemDesconto / 100);
        }

        if (tipoCombustivel.equals("a") && litros <= 20){
            int porcentagemDesconto = 3;
            formula = precoAlcool * litros - ((precoAlcool * litros) * porcentagemDesconto / 100);
        }

        if (tipoCombustivel.equals("a") && litros > 20){
            int porcentagemDesconto = 5;
            formula = precoAlcool * litros - ((precoAlcool * litros) * porcentagemDesconto / 100);
        }

        System.out.println(formula);

        scanner.close();

    }
}
