package com.leandro.aulajava.aula19;

public class Exercicio34 {
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

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analisando o numero: " + vetorA[i]);
            for (int j = 2; j < vetorA[i]; j++) {
                if (j % 2 == 0){
                    System.out.println(j + " par");
                }
            }
        }
    }
}
