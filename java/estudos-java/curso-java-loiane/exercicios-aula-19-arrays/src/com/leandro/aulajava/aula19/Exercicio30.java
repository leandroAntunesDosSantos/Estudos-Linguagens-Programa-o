package com.leandro.aulajava.aula19;

public class Exercicio30 {
    public static void main(String[] args) {

        int[] vetorA = new int[20];
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
        vetorA[15] = 16;
        vetorA[16] = 17;
        vetorA[17] = 18;
        vetorA[18] = 19;
        vetorA[19] = 20;

        int[] vetoresPares = new int[20];
        int contPares = 0;

        int[] vetoresImpares = new int[20];
        int contImpares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0){
                vetoresPares[contPares] = vetorA[i];
                contPares++;
            }

            if (vetorA[i] % 2 != 0){
                vetoresImpares[contImpares] = vetorA[i];
                contImpares++;
            }
        }

        for (int i = 0; i < vetoresPares.length; i++) {
            //System.out.println(vetoresImpares[i]);
            System.out.println(vetoresPares[i]);
        }
    }
}
