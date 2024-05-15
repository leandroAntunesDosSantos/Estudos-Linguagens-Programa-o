package com.leandro.cursojava.aula17;

public class ForPartesAusentes {
    public static void main(String[] args) {
//           int count = 0;
//
//        for ( ;count < 10; ){
//            System.out.println("Valor de count: " + count);
//            count += 2;
//        }

//        for (int count = 0; count < 10; count += 2) {
//            System.out.println("Valor de count: " + count);
//        }

        int soma = 0;

        for (int i = 1; i <= 5; soma += i++)
            System.out.println("O valor da soma é " + soma);


    }
}
