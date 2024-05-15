package com.leandro.aulajava.aula19;

public class Exercicio24 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        numeros[0] = 9;
        numeros[1] = 8;
        numeros[2] = 7;
        numeros[3] = 6;
        numeros[4] = 5;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;

        boolean verificador = true;

        for (int i = 0, j = numeros.length - 1; i < numeros.length / 2; i++, j--) {
            if (numeros[i] != numeros[j]){
                verificador = false;
                break;
            }
        }
        if (verificador){
            System.out.println("São palindromos!");
        }else {
            System.out.println("Não são palindromos");
        }
    }
}
