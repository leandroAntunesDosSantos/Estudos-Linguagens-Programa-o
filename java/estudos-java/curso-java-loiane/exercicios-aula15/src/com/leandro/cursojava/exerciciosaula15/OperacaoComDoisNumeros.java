package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class OperacaoComDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite outro numero:");
        double numero2 = scanner.nextDouble();

        System.out.println("Qual operação você deseja realizar? ");
        String operacao = scanner.next();

        double resultado = 0;

        if (operacao.equals("soma")){
            resultado = numero1 + numero2;
        }
        if (operacao.equals("subtração")){
            resultado = numero1 - numero2;
        }
        if (operacao.equals("multiplicação")){
            resultado = numero1 * numero2;
        }
        if (operacao.equals("divisão")){
            resultado = numero1 / numero2;
        }

        System.out.println("Resultado: " + resultado);

        if (resultado % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
        if (resultado > 0){
            System.out.println("Positivo");
        }else if (resultado < 0){
            System.out.println("Negativo");
        }else {
            System.out.println("Igual a zero");
        }

        if (resultado % 1 == 0){
            System.out.println("Numero inteiro");
        }else {
            System.out.println("Numero decimal");
        }

        scanner.close();

    }
}
