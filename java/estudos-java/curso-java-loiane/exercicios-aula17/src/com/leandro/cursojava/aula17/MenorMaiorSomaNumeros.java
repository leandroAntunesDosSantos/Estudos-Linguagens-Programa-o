package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class MenorMaiorSomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite quantidade de numeros que serão digitado: ");
        int quantidade = scanner.nextInt();

        int contador = 0;

        int variavel;

        int menorNumero = 1_000_000;
        int maiorNumero = 0;
        int soma = 0;

        do {
            contador++;
            System.out.println("digite o numero: ");
            variavel = scanner.nextInt();

            if (variavel < menorNumero){
                menorNumero = variavel;
            }
            if (variavel > maiorNumero){
                maiorNumero = variavel;
            }
            soma += variavel;
        }while (contador < quantidade);
        scanner.close();

        System.out.println("menor numero: " + menorNumero);
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Soma dos números digitados: " + soma);
    }
}
