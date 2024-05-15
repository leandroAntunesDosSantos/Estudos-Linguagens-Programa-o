package com.leandro.aulajava.aula19;

public class Exercicio9 {
    public static void main(String[] args) {

        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] vetorC = new double[10];

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


        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
            vetorB[i] = vetorA[i];

        }
        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.println();
        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }
}
