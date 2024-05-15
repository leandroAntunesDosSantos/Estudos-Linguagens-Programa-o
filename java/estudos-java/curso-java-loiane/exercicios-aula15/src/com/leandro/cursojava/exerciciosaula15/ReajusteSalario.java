package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = scanner.nextDouble();

        double valorReajuste = 0;
        int percentual = 0;

        if (salario <= 280.00){
            percentual = 20;
            valorReajuste = ((salario * percentual) / 100);
        }
        if (salario > 280.00 && salario <= 700){
            percentual = 15;
            valorReajuste = ((salario * percentual) / 100);
        }
        if (salario > 700 && salario <= 1500){
            percentual = 10;
            valorReajuste = ((salario * percentual) / 100);
        }
        if (salario > 1500){
            percentual = 5;
            valorReajuste = ((salario * percentual) / 100);
        }

        double salarioReajustado = salario + valorReajuste;

        System.out.println("Salario Anterior: R$ " + salario);
        System.out.println("Valor Reajuste: R$ " + valorReajuste);
        System.out.println("Percentual ajuste: " + percentual + "%");
        System.out.println("Salario após reajuste: R$ " + salarioReajustado);

        scanner.close();
    }
}
