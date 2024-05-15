package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class IntervaloDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validate = true;

        int intervalo0_25 = 0;
        int intervalo26_50 = 0;
        int intervalo51_75 = 0;
        int intervalo76_100 = 0;

        do {
            System.out.println("Digite um numero:");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <=25 ){
                intervalo0_25 ++;
            }
            if (numero >= 26 && numero <= 50){
                intervalo26_50 ++;
            }
            if (numero >=51 && numero <= 75){
                intervalo51_75 ++;
            }
            if (numero >= 76 && numero <= 100){
                intervalo76_100 ++;
            }
            if (numero < 0){
                System.out.println("Numero invalido! ");
                System.out.println("Programa encerrado");
                validate = false;
            }
            System.out.println("Quantidade de numeros no intervalo de 0 a 25: " + intervalo0_25);
            System.out.println("Quantidade de numeros no intervalo de 26 a 50: " + intervalo26_50);
            System.out.println("Quantidade de numeros no intervalo de 51 a 75: " + intervalo51_75);
            System.out.println("Quantidade de numeros no intervalo de 76 a 100: " + intervalo76_100);

        }while (validate);
        scanner.close();
    }
}
