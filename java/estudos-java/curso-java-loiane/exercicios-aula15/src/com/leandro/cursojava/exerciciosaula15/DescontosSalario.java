package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class DescontosSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite quantas horas voce trabalhou: ");
        int quantidadeHoras = scanner.nextInt();

        double salarioAReceber = valorHora * quantidadeHoras;

        double impostoRenda = 0;
        double percentualImpostoRenda = 0;
        double sindicato = (salarioAReceber * 3)/100;
        double inss = (salarioAReceber * 10)/100;
        double fgts = (salarioAReceber * 11)/100;


        if (salarioAReceber <= 900){
            impostoRenda = 0;
        }
        if (salarioAReceber > 900 && salarioAReceber <= 1500){
            percentualImpostoRenda = 5;
            impostoRenda = (salarioAReceber * percentualImpostoRenda)/100;
        }
        if (salarioAReceber > 1500 && salarioAReceber <= 2500){
            percentualImpostoRenda = 10;
            impostoRenda = (salarioAReceber * percentualImpostoRenda)/100;
        }
        if (salarioAReceber > 2500){
            percentualImpostoRenda = 20;
            impostoRenda = (salarioAReceber * percentualImpostoRenda)/100;
        }

        double salarioLiquido = salarioAReceber - inss - sindicato - impostoRenda;

        System.out.println("Salário bruto: (" + valorHora + " * " + quantidadeHoras + ") R$ " + salarioAReceber);
        System.out.println("(-) IR ("+ percentualImpostoRenda +") R$ " + impostoRenda);
        System.out.println("(-) INSS (10%) R$ " + inss);
        System.out.println("Sindicato (3%) R$ " + sindicato);
        System.out.println("FGTS (11%) R$ " + fgts);
        System.out.println("Total de desconto: R$ " + (inss + sindicato + impostoRenda));
        System.out.println("Salário Liquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
