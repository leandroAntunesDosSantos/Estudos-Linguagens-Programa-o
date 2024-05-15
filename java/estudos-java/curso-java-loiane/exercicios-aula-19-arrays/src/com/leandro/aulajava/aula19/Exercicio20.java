package com.leandro.aulajava.aula19;

public class Exercicio20 {
    public static void main(String[] args) {

        double cotacao = 4.99;

        double[] vetorA = new double[10];
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

        double[] conversao = new double[10];

        for (int i = 0; i < vetorA.length; i++) {
            conversao[i] = vetorA[i] * cotacao;
            System.out.println((i + 1) + " Real" + "Dolar: " + conversao[i]);
        }

    }
}
