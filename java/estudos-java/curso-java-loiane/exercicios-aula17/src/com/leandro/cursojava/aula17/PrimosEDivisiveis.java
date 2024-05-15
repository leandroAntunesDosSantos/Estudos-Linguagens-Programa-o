package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class PrimosEDivisiveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se é primo: ");
        int numero = scanner.nextInt();

        int verificacao = 0;



        for (int i = 1; i <= numero ; i++) {

            if (numero % i == 0){
                verificacao++;
            }

        }

        boolean primo = false;

        if (verificacao == 2){
            System.out.println("Numero primo");
            primo = true;
        }else {
            System.out.println("Não é número primo");
        }

        if (!primo){
            for (int i = 1; i <= numero ; i++) {
                if (numero % i == 0){
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
