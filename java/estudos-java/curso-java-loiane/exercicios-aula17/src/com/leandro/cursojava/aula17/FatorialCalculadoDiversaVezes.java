package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class FatorialCalculadoDiversaVezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial;
        int numero;
        boolean validate = false;

        do {
            System.out.println("Digite o numero que quer saber o fatorial entre 0 e 16: ");
            numero = scanner.nextInt();

            if (numero < 0 || numero >= 16){
                validate = true;
            }

            fatorial = 1;

            for (int i = numero; i > 0 ; i--) {
                fatorial *= i;
            }

        }while (validate);
        scanner.close();

        System.out.println(fatorial);

    }
}
