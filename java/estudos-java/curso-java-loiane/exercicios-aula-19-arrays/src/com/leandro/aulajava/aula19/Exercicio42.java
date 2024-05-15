package com.leandro.aulajava.aula19;

public class Exercicio42 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;



        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetorA[i] > vetorA[j]) {
                    int temp = vetorA[i];
                    vetorA[i] = vetorA[j];
                    vetorA[j] = temp;
                }
            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
    }
}
