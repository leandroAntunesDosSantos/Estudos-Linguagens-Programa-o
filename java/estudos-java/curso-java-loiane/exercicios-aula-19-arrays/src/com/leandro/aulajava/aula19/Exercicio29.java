package com.leandro.aulajava.aula19;

public class Exercicio29 {
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

        int[] vetorB = new int[10];

        vetorB[0] = 11;
        vetorB[1] = 12;
        vetorB[2] = 13;
        vetorB[3] = 14;
        vetorB[4] = 15;
        vetorB[5] = 16;
        vetorB[6] = 17;
        vetorB[7] = 18;
        vetorB[8] = 19;
        vetorB[9] = 20;

        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length + vetorB.length; i++) {
            if (i < 10){
                vetorC[i] = vetorA[i];
            }else {
                vetorC[i] = vetorB[i % 10];
            }

            System.out.println("Vetor C " + vetorC[i]);
        }

    }
}
