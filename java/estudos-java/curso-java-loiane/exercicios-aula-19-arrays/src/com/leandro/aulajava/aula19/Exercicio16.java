package com.leandro.aulajava.aula19;

public class Exercicio16 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];

        vetorA[0] = 10;
        vetorA[1] = 11;
        vetorA[2] = 12;
        vetorA[3] = 13;
        vetorA[4] = 14;
        vetorA[5] = 15;
        vetorA[6] = 16;
        vetorA[7] = 17;
        vetorA[8] = 18;
        vetorA[9] = 19;

        double menoresQue15 = 0;
        double igualA15 = 0;
        double maiorQue15 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 15){
                menoresQue15 ++;
            }
            if (vetorA[i] == 15){
                igualA15 ++;
            }
            if (vetorA[i] > 15){
                maiorQue15 ++;
            }
        }

        System.out.println("Menor que 15: " + menoresQue15);
        System.out.println("Igual a 15: " + igualA15);
        System.out.println("Menor que 15: " + maiorQue15);
    }
}
