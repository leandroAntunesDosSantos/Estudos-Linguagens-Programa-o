package com.leandro.aulajava.aula19;

import java.text.DecimalFormat;

public class Exercicio4 {
    public static void main(String[] args) {

        double[] vetorA = new double[15];
        double[] vetorB = new double[15];

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
        vetorA[11] = 12;
        vetorA[12] = 13;
        vetorA[13] = 14;
        vetorA[14] = 15;

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
            vetorB[i] = Math.sqrt(vetorA[i]);

        }

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.println();
        System.out.printf("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }

    }
}
