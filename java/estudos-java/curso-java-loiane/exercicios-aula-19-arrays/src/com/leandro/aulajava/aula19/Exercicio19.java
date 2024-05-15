package com.leandro.aulajava.aula19;

public class Exercicio19 {
    public static void main(String[] args) {

        double[] vetorA = new double[10];
        vetorA[0] = 55;
        vetorA[1] = 76;
        vetorA[2] = 89;
        vetorA[3] = 80;
        vetorA[4] = 30;
        vetorA[5] = 65;
        vetorA[6] = 72;
        vetorA[7] = 96;
        vetorA[8] = 100;
        vetorA[9] = 88;

        double[] vetorB = new double[10];

        vetorB[0] = 65;
        vetorB[1] = 43;
        vetorB[2] = 55;
        vetorB[3] = 97;
        vetorB[4] = 70;
        vetorB[5] = 64;
        vetorB[6] = 82;
        vetorB[7] = 85;
        vetorB[8] = 42;
        vetorB[9] = 59;

        double[] result = new double[10];

        for (int i = 0; i < vetorA.length; i++) {
            result[i] = (vetorA[i] + vetorB[i]) /2;
            System.out.println("Nota: " + result[i]);
            if (result[i] >= 70){
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado");
            }
            System.out.println("-----------");
        }
    }
}
