package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scanner.nextLine();

        if (letra.equals("a") || letra.equals("e")|| letra.equals("i")|| letra.equals("o")||letra.equals("u")){
            System.out.println("Vogal");
        }else {
            System.out.println("Consoante");
        }

        scanner.close();
    }
}
