package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class CrescimentoPopulacionalScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double popA;
        double taxA;

        double popB;
        double taxB;

        boolean verificacaoTaxas = false;

        do {
            System.out.println("Digite o tamanho da população da cidade A: ");
            popA = scanner.nextDouble();
            System.out.println("digite a taxa de crescimento da cidade A ");
            taxA = scanner.nextDouble();

            System.out.println("Digite o tamanho da população da cidade B: ");
            popB = scanner.nextDouble();
            System.out.println("digite a taxa de crescimento da cidade B ");
            taxB = scanner.nextDouble();

            if (taxB != taxA){
                verificacaoTaxas = true;
            }else {
                System.out.println("Taxas precisam ser diferentes");
            }

        }while (verificacaoTaxas == false);

        double maiorPopulacaoInicial = 0;
        double taxaMaiorPopulacaoInicial = 0;

        double menorPopulacaoInicial = 0;
        double taxaMenorPopulacaoInicial = 0;

        if (popA >= popB){
            maiorPopulacaoInicial = popA;
            menorPopulacaoInicial = popB;

            taxaMaiorPopulacaoInicial = taxA;
            taxaMenorPopulacaoInicial = taxB;

        }else {
            maiorPopulacaoInicial = popB;
            menorPopulacaoInicial = popA;

            taxaMaiorPopulacaoInicial = taxB;
            taxaMenorPopulacaoInicial = taxA;
        }

        boolean validate = false;
        int contador = 0;



        do {
            contador++;

            maiorPopulacaoInicial += (maiorPopulacaoInicial * taxaMaiorPopulacaoInicial)/100;

            menorPopulacaoInicial += (menorPopulacaoInicial * taxaMenorPopulacaoInicial)/100;

            if (menorPopulacaoInicial >= maiorPopulacaoInicial){
                validate = true;
            }

        }while (validate == false);

        scanner.close();

        System.out.println(contador + " anos");
    }
}
