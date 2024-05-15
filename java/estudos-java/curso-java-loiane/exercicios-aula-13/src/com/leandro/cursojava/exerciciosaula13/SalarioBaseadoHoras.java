package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class SalarioBaseadoHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que voce ganha por hora trabalhada: ");
        double valor = scanner.nextDouble();

        System.out.println("Digite quantas horas você trabalhou esse mês; ");
        double hora = scanner.nextDouble();

        double salario = valor * hora;

        System.out.println("O seu salario esse mês será de: R$ " + salario);
    }
}
