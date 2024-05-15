package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class JoaoPescador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o peso de peixe? ");
        double pesoPeixes = scanner.nextDouble();

        double pesoExcedente = 0;

        if (pesoPeixes > 50){
            pesoExcedente = pesoPeixes - 50;
        }
        double valorMulta = pesoExcedente * 4;

        System.out.println("O valor da multa a se pagar é " + valorMulta);

    }
}
