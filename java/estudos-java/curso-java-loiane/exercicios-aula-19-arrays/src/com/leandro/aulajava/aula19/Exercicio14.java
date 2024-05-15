package com.leandro.aulajava.aula19;

public class Exercicio14 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;

        int soma = 0;
        double media = 0;

        System.out.print("Os valores: ");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0){
                System.out.print(vetorA[i] + " ");
                soma += vetorA[i];

            }
            media = soma / (vetorA.length / 2);
        }
        System.out.println("Soma: "+ soma);
        System.out.println("Media: " + media);
    }
}
