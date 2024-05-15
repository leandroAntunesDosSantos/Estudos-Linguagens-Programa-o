package com.leandro.aulajava.aula19;

public class Exercicio15 {
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

        double numerosPares = 0;
        double numerosImpares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0){
                numerosPares ++;
            }else{
                numerosImpares++;
            }
        }
        int quantidadeDeIndice = vetorA.length;

        System.out.println("Numero pares: " + numerosPares );
        System.out.println("Numero impares: " + numerosImpares );
        System.out.println(quantidadeDeIndice);
        System.out.println("Numeros Pares " + (numerosPares / quantidadeDeIndice) * 100  + "%");
        System.out.println("Numeros Impares " + (numerosImpares / quantidadeDeIndice) * 100  + "%");
    }
}
