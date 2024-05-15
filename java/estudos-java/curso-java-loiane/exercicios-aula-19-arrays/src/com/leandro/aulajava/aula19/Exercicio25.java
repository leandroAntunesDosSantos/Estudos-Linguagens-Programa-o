package com.leandro.aulajava.aula19;

public class Exercicio25 {
    public static void main(String[] args) {

        int[] numerosA = new int[10];
        numerosA[0] = 0;
        numerosA[1] = 1;
        numerosA[2] = 2;
        numerosA[3] = 3;
        numerosA[4] = 4;
        numerosA[5] = 5;
        numerosA[6] = 6;
        numerosA[7] = 7;
        numerosA[8] = 8;
        numerosA[9] = 9;

        int[] numerosB =new int[numerosA.length];

        for (int i = 0; i < numerosA.length; i++) {
            if (numerosA[i] % 2 == 0){
                numerosB[i] = 1;
            }else {
                numerosB[i] = 0;
            }
            System.out.println(i + "-" + numerosB[i]);
        }
    }
}
