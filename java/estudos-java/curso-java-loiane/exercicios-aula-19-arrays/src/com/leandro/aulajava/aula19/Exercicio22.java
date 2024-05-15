package com.leandro.aulajava.aula19;


public class Exercicio22 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];

        int qtd0 = 0;

        int qtd1 = 1;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            System.out.println(vetorA[i]);

            if (vetorA[i] == 0){
                qtd0++;
            }else {
                qtd1++;
            }

        }

        System.out.println("Porcentagem de 0 " + qtd0 * 10);
        System.out.println("Porcentagem de 1 " + qtd1 * 10);

    }
}
