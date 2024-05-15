package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        int contador = 0;

        int maiorNumero = 0;

        do {
            contador++;

            System.out.println("Digite um número: ");
            numero = scanner.nextInt();

            if (numero>maiorNumero){
                maiorNumero = numero;
            }

        }while (contador < 5);

        scanner.close();
        System.out.println("Maior numero digitado " + maiorNumero);


    }


}
