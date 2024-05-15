package com.leandro.aulajava.aula19;

public class Exercicio37 {
    public static void main(String[] args) {

        int[] vetorA = new int[15];
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

        int[] vetorB = new int[vetorA.length];

        for (int i = vetorA.length - 1; i >= 0 ; i--) {
            int fatorial = vetorA[i];
            System.out.println("Fatorial de " + vetorA[i] + ":");
            for (int j = i; j > 0 ; j--) {
                fatorial = fatorial * j;
            }
            System.out.println(fatorial);
            System.out.println("_________");
            vetorB[i] = fatorial;
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }
}
