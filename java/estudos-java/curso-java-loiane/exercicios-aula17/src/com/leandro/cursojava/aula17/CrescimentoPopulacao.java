package com.leandro.cursojava.aula17;

public class CrescimentoPopulacao {

    public static void main(String[] args) {

        boolean validate = false;

        double popA = 80_000;
        double popB = 200_000;
        int contador = 0;

        do {
            contador++;

            popA = popA + (popA * 3)/100;

            popB = popB + (popB * 1.5)/100;

            if (popA>=popB){
                validate = true;
            }
        }while (validate == false);

        System.out.println(contador + " anos");

    }

}
