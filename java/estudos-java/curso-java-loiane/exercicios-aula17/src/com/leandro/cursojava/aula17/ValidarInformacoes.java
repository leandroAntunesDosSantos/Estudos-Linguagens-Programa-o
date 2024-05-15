package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class ValidarInformacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validacao = false;

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

            System.out.println("Digite seu salario: ");
            salario = scanner.nextDouble();

            System.out.println("Digite seu sexo: ");
            sexo = scanner.next();

            System.out.println("Digite seu Estado civil: ");
            estadoCivil = scanner.next();

            if ((nome.length() > 3) &&
                    (idade > 0 && idade < 150) && (salario > 0) &&
                    (sexo.equals("feminino") || sexo.equals("masculino")) &&
                    (estadoCivil.equals("solteiro") || estadoCivil.equals("casado") || estadoCivil.equals("viuvo") || estadoCivil.equals("divorciado"))){
                validacao = true;
                System.out.println(nome);
                System.out.println(idade);
                System.out.println(salario);
                System.out.println(sexo);
                System.out.println(estadoCivil);
            }else {
                validacao = false;
                System.out.println("Informações invalidas digite novamente:");
            }

        } while (validacao == false);
        scanner.close();
    }
}
