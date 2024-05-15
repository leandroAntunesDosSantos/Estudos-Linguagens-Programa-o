package com.leandro.aulajava.aula19;

public class Exercicio41 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;

        int busca = 3;
        boolean validate = false;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == busca){
                System.out.println("Indice: " + i);
                validate = true;
                break;
            }
        }
        if (validate){
            System.out.println("valor " + busca + " foi encontrado");
        }else {
            System.out.println("Nao foi encontrado ");
        }

    }
}
