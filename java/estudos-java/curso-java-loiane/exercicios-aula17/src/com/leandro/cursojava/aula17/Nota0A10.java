package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class Nota0A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean notaValida;

        do {
            System.out.println("digite uma nota de 0 a 10");
            int nota = scanner.nextInt();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Voce digitou " + nota);
            }else {
                notaValida = false;
                System.out.println("nota invalida digite novamente.");
            }

        } while (notaValida == false);
        scanner.close();
    }
}
