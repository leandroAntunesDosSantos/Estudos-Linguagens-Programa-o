package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o salario inicial do funcionario: ");
        double salarioInicial = scanner.nextInt();

        System.out.println("Digite o ano de referencia que ele trabalhou até o momento:");
        int anoReferencia = scanner.nextInt();

        double percentualAumento1996 = 1.5;

        int quantidadeTotal = anoReferencia - 1996;

        double percentualSeguinte = percentualAumento1996;
        int anosTrabalhados = 0;

        for (int i = 1; i <=quantidadeTotal ; i++) {
            percentualSeguinte *= 2;
            anosTrabalhados = i;
        }

        double salarioAtual = salarioInicial + (salarioInicial * percentualSeguinte)/100;

        System.out.println("Salario Reajustado R$ " + salarioAtual);
        System.out.println("Percentual aumento " + percentualSeguinte + " %");
        System.out.println("Anos trabalhados: " + anosTrabalhados);

        scanner.close();
    }
}
