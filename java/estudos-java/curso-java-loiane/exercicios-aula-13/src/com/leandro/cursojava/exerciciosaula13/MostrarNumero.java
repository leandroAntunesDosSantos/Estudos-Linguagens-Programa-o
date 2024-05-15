package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class MostrarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println("O numero informado foi: "+ numero);
    }


}
