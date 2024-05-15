package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class ContadorNumeroParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int numerosPares = 0;
        int numerosImpares = 0;
        int contador = 0;

        do {
            contador++;
            System.out.println("digite um numero: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0){
                numerosPares += 1;
            }else {
                numerosImpares += 1;
            }

        }while (contador < 10);
        scanner.close();

        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares " +numerosImpares);
    }
}
