package com.leandro.aulajava.aula19;

public class Exercicio11 {
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

        int[] vetorPar = new int[10];

        int contador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0){
                vetorPar[i] = vetorA[i];
                contador++;

            }
        }

        System.out.println();
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.print(vetorPar[i] + " ");
        }
        System.out.println("Quantidade de pares: " + contador);
    }
}
