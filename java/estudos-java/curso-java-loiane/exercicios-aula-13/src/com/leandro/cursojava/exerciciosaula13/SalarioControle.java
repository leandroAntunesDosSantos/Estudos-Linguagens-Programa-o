package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class SalarioControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = scanner.nextDouble();

        System.out.println("Quantas horas você trabalhou nesse mês: ");
        int quantidadeHoras = scanner.nextInt();

        double salario = valorHora * quantidadeHoras;

        double descontoImpostoRenda = salario * 0.11;
        double descontoINSS = salario * 0.08;
        double descontoSindicato = salario * 0.05;
        double salarioLiquido = salario - descontoImpostoRenda - descontoINSS - descontoSindicato;

        System.out.println("Salario bruto: R$ " + salario);
        System.out.println("Imposto de renda: R$ " + descontoImpostoRenda);
        System.out.println("Desconto INSS R$ " + descontoINSS);
        System.out.println("Desconto sindicato R$ " + descontoSindicato);
        System.out.println("Salario liquido R$ " + salarioLiquido);


    }


}
