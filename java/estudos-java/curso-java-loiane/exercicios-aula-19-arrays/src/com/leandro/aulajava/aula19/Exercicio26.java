package com.leandro.aulajava.aula19;

public class Exercicio26 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 11;
        vetorA[1] = 11;
        vetorA[2] = 11;
        vetorA[3] = 1;
        vetorA[4] = 1;
        vetorA[5] = 1;
        vetorA[6] = 1;
        vetorA[7] = 1;
        vetorA[8] = 1;
        vetorA[9] = 1;

        int[] vetorB = new int[vetorA.length];
        vetorB[0] = 1;
        vetorB[1] = 1;
        vetorB[2] = 1;
        vetorB[3] = 1;
        vetorB[4] = 1;
        vetorB[5] = 1;
        vetorB[6] = 11;
        vetorB[7] = 11;
        vetorB[8] = 11;
        vetorB[9] = 11;

        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }
            if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }
            if (vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }

            System.out.println(vetorC[i]);
        }


    }
}
