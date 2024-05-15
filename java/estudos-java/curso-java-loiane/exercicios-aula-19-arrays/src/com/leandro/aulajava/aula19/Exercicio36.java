package com.leandro.aulajava.aula19;

public class Exercicio36 {
    public static void main(String[] args) {

        double[] vetorA = new double[11];
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
        vetorA[10] = 11;

        for (int i = 0; i < vetorA.length ; i++) {
            vetorA[i] = Math.pow(2,i);
            System.out.println(vetorA[i]);
        }
    }
}
