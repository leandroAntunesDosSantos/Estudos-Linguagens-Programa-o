package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class CentenasDezenasUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 999:");
        String numeroString = scanner.next();

        boolean validacao = false;
        int numeroInt = Integer.parseInt(numeroString);

        if (numeroInt >= 0 && numeroInt <= 999){
            validacao = true;
        }

        if (validacao && numeroString.length() == 1){
            System.out.println(numeroString + " unidades");
        }

        if (validacao && numeroString.length() == 2){
            System.out.println(numeroString.charAt(0) + " dezenas e " + numeroString.charAt(1) + " unidades");
        }

        if (validacao && numeroString.length() == 3){
            System.out.println(numeroString.charAt(0) + " centena " + numeroString.charAt(1) + " dezenas e " + numeroString.charAt(2) + " unidades");
        }
        if (!validacao){
            System.out.println("Numero invalido");
        }

        scanner.close();

    }
}
