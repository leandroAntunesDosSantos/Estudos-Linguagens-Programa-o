package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class MediaDasNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que serao avaliadas: ");
        int quantidade = scanner.nextInt();

        double soma = 0;

        int contador = 0;

        while (contador < quantidade){
            System.out.println("digite uma nota: ");
            int nota = scanner.nextInt();
            soma += nota;
            contador++;
        }
        double media = soma / quantidade;
        System.out.println(media);

        scanner.close();
    }
}
