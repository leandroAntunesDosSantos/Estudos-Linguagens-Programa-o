package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de saque: ");
        String valorSaqueString = scanner.next();

        int nota100Reais = 0;
        int nota50Reais = 0;
        int nota10Reais = 0;
        int nota5reais = 0;
        int nota1Real = 0;

        int valorSaqueInt = Integer.parseInt(valorSaqueString);

        boolean validacao = false;

        if (valorSaqueInt > 0 && valorSaqueInt <= 600){
            validacao = true;
        }

        if (validacao){
            nota100Reais = valorSaqueInt / 100;
            int resto100 = valorSaqueInt % 100;

            nota50Reais = resto100 / 50;
            int resto50 = resto100 % 50;

            nota10Reais = resto50 / 10;
            int resto10 = resto50 % 10;

            nota5reais = resto10 / 5;
            int resto5 = resto10 % 5;

            nota1Real = resto5 / 1;

        }

        System.out.println(nota100Reais + " Notas de 100 reais ");
        System.out.println(nota50Reais + " Notas de 50 reais");
        System.out.println(nota10Reais + " Notas de 10 reais");
        System.out.println(nota5reais + " Notas de 5 reais");
        System.out.println(nota1Real + " Notas de 1 real");

        scanner.close();
    }

}
