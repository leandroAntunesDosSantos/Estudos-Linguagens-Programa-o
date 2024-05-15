package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos metros de area serão pintadas: ");
        int areaPintar = scanner.nextInt();

        int quantidadeLitros = areaPintar/3;

        int quantidadeLatas = quantidadeLitros / 18;

        System.out.println("Quantidade de latas: " + quantidadeLatas + ", preço R$" + quantidadeLatas * 80);


    }
}
