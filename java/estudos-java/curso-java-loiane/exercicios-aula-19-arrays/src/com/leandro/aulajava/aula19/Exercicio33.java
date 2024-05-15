package com.leandro.aulajava.aula19;

public class Exercicio33 {
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

        for (int i = vetorA.length - 1; i >= 0 ; i--) {
            int contador = 0;
            for (int j = vetorA.length - 1; j >= 0  ; j--) {
                if (vetorA[i] % vetorA[j] == 0){
                    contador++;
                }

            }
            if (contador == 2){
                System.out.println(vetorA[i] + ": é primo");
            }else {
                System.out.println(vetorA[i] + ": não é primo");
            }

        }

    }
}
