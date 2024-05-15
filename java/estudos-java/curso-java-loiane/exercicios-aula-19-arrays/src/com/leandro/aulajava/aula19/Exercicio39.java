package com.leandro.aulajava.aula19;

public class Exercicio39 {
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

        int[] vetorB = new int[vetorA.length];
        vetorB[0] = 6;
        vetorB[1] = 7;
        vetorB[2] = 2;
        vetorB[3] = 3;
        vetorB[4] = 5;
        vetorB[5] = 8;
        vetorB[6] = 10;
        vetorB[7] = 5;
        vetorB[8] = 1;
        vetorB[9] = 5;

        int contador = 0;


        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length ; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]){
                    vetorC[contador] = vetorA[i];
                    contador++;
                    break;
                }
            }

        }
        for (int i = 0; i < contador; i++) {
            System.out.println(vetorC[i]);
        }
    }
}
