package com.leandro.aulajava.aula19;

public class Exercicio23 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        numeros[0] = 6;
        numeros[1] = 24;
        numeros[2] = 8;
        numeros[3] = 2;
        numeros[4] = 4;
        numeros[5] = 78;
        numeros[6] = 28;
        numeros[7] = 24;
        numeros[8] = 22;
        numeros[9] = 90;

        boolean verificador = true;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0){
                verificador = false;
                System.out.println("Numero impar no indice " + i);
            }
            if (!verificador){
                break;
            }
        }
        if (verificador){
            System.out.println("Todos os numeros eram pares");
        }
    }
}
