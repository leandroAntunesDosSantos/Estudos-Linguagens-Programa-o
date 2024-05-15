package com.leandro.aulajava.aula19;

public class Exercicio40 {
    public static void main(String[] args) {

        int[] vetorA = new int[3];
        vetorA[0] = 1;
        vetorA[1] = 1;
        vetorA[2] = 3;

        int[] vetorB = new int[vetorA.length];
        vetorB[0] = 9;
        vetorB[1] = 12;
        vetorB[2] = 5;

        int[] vetorC = new int[6];

        int contador = 0;


        for (int i = 0, j = 0 ; i < vetorA.length; i++,j++) {
            if (vetorA[i] != vetorB[j]){
                vetorC[contador] = vetorA[i];
                contador++;
            }
            if (vetorB[j] != vetorA[i]){
                vetorC[contador] = vetorB[j];
                contador++;
            }


        }
        System.out.println("contador " + contador);

        for (int i = 0; i < contador; i++) {
            System.out.println(vetorC[i]);
        }



    }
}
