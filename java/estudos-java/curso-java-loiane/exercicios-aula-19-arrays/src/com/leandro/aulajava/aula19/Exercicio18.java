package com.leandro.aulajava.aula19;

public class Exercicio18 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        vetorA[0] = 30;
        vetorA[1] = 31;
        vetorA[2] = 32;
        vetorA[3] = 33;
        vetorA[4] = 34;
        vetorA[5] = 35;
        vetorA[6] = 36;
        vetorA[7] = 37;
        vetorA[8] = 38;
        vetorA[9] = 39;

        int menorIdade = 1000;
        int maiorIdade = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] <= menorIdade){
              menorIdade = vetorA[i];
            }
            if (vetorA[i] >= maiorIdade){
                maiorIdade = vetorA[i];
            }
        }
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("maior idade: " + maiorIdade);
    }
}
