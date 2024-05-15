package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class MenorMaiorSomaNumerosAte100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que serão analisados: ");
        int quantidade = scanner.nextInt();

        int contador = 0;
        boolean validate = true;

        int menorNumero = 100;
        int maiorNumero = 0;
        int soma = 0;




        do {
            contador++;
            System.out.println("digite o numero: ");
            int numero = scanner.nextInt();

            if (numero > 1000){
                validate = false;
                System.out.println("CÓDIGO INVALIDADO");
            }

            if (numero < menorNumero){
                menorNumero = numero;
            }
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
            soma += numero;


        }while (contador < quantidade && validate);
        scanner.close();

        System.out.println("Menor valor: " + menorNumero);
        System.out.println("Maior valor: " + maiorNumero);
        System.out.println("Soma dos valores " + soma);
    }
}
