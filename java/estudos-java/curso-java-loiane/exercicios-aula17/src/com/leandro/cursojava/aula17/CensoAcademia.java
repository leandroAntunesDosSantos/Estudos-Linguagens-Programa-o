package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class CensoAcademia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validate = true;

        int codigo = 0;

        int codigoMenorPeso = 0;
        double menorPeso = 1_000;

        int codigoMaiorPeso = 0;
        double maiorPeso = 0;

        int codigoMenorAltura = 0;
        double menorAltura = 1_000;

        int codigoMaiorAltura = 0;
        double maiorAltura = 0;

        while (validate){
            codigo ++;
            System.out.println("qual o seu peso? ");
            double peso = scanner.nextDouble();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();

            if (peso < menorPeso){
                menorPeso = peso;
                codigoMenorPeso = codigo;
                System.out.println("Codigo: " + codigo);
                System.out.println("menor peso " + menorPeso);
            }

            if (peso > maiorPeso){
                maiorPeso = peso;
                codigoMaiorPeso = codigo;
                System.out.println("Codigo: " + codigo);
                System.out.println("Maior peso: " + maiorPeso);
            }

            if (altura < menorAltura){
                menorAltura = altura;
                codigoMenorAltura = codigo;
                System.out.println("Codigo: " + codigo);
                System.out.println("Menor altura: " + menorAltura);
            }

            if (altura > maiorAltura){
                maiorAltura = altura;
                codigoMaiorAltura = codigo;
                System.out.println("Codigo: " + codigo);
                System.out.println("Maior altura: " + maiorAltura);
            }
            System.out.println("Codigo: " + codigoMenorPeso + " Menor peso " + menorPeso);
            System.out.println("Codigo: " + codigoMaiorPeso + " Maior peso: " + maiorPeso);
            System.out.println("Codigo: " + codigoMenorAltura + " Menor altura: " + menorAltura);
            System.out.println("Codigo: " + codigoMaiorAltura + " Maior altura: " + maiorAltura);

            if (peso == 0 || altura == 0){
                validate = false;
            }
        }
        scanner.close();
    }
}
