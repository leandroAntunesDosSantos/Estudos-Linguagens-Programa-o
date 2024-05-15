package com.leandro.aulajava.aula19;

public class Exercicio27 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 11;
        vetorA[1] = 11;
        vetorA[2] = 11;
        vetorA[3] = 1;
        vetorA[4] = 1;
        vetorA[5] = 7;
        vetorA[6] = 10;
        vetorA[7] = 1;
        vetorA[8] = 6;
        vetorA[9] = 5;

        //int[] vetorB = new int[10];  //aparece o numero do caractere
        char[] vetorB = new char[10];


        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            }
            if (vetorA[i] == 7){
                vetorB[i] = 'b';
            }
            if (vetorA[i] > 7 && vetorB[i] < 10){
                vetorB[i] = 'c';
            }
            if (vetorA[i] == 10){
                vetorB[i] = 'd';
            }
            if (vetorA[i] > 10){
                vetorB[i] = 'e';
            }

            System.out.println(vetorB[i]);
        }

    }
}
