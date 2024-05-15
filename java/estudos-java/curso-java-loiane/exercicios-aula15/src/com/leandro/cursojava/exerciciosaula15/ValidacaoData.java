package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class ValidacaoData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia do mês: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o valor do mês correspondente: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();

        boolean validacao = true;

        if (dia < 1 || dia > 31){
            System.out.println("Dia Invalido");
            validacao = false;
        }

        if (mes < 1 || mes > 12){
            System.out.println("Mes Invalido");
            validacao = false;
        }
        if (ano < 0 || ano > 3000){
            System.out.println("Ano invalido");
            validacao = false;
        }

        if (validacao){
            System.out.println("Data Válida!");
            System.out.println(dia + "/" + mes + "/" + ano);
        }else {
            System.out.println("Data invalida");
        }

        scanner.close();

    }
}
