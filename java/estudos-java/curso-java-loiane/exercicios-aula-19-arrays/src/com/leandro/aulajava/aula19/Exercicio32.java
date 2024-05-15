package com.leandro.aulajava.aula19;

public class Exercicio32 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;

        for (int i = vetorA[0]; i < vetorA[vetorA.length - 1]; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println("--------------");
        }
    }
}
