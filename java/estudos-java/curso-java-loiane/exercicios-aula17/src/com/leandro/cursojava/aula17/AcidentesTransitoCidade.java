package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class AcidentesTransitoCidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeCidades = 5;

        int contador = 1;

        String cidadeMenorIndiceAcidente = "";
        int codigoMenorIndiceAcidente = 0;
        double menorIndiceAcidente = 100000;

        String cidadeMaiorIndiceAcidente = "";
        int codigoMaiorIndiceAcidente = 0;
        double maiorIndiceAcidente = 0;

        double totalDeVeiculos = 0;

        double quantidadeDeVeiculosCommenos2000 = 0;
        double acidentesComMenosDe2000Veiculos = 0;

        while (contador <= quantidadeCidades){

            System.out.println("Digite o nome da cidade:");
            String cidade = scanner.next();

            System.out.println("Digite a quantidade de veiculos total: ");
            double quantidadeDeVeiculos = scanner.nextDouble();

            totalDeVeiculos += quantidadeDeVeiculos;

            System.out.println("Digite a quantidade de acidentes que ocorreram");
            double acidentes = scanner.nextDouble();

            if (quantidadeDeVeiculos < 2000){
                quantidadeDeVeiculosCommenos2000 = quantidadeDeVeiculos;
                acidentesComMenosDe2000Veiculos = acidentes;
            }

            double indiceAcidentes = (acidentes / quantidadeDeVeiculos) * 100;

            if (indiceAcidentes < menorIndiceAcidente){
                codigoMenorIndiceAcidente = contador;
                cidadeMenorIndiceAcidente = cidade;
                menorIndiceAcidente = indiceAcidentes;
            }

            if (indiceAcidentes > maiorIndiceAcidente){
                codigoMaiorIndiceAcidente = contador;
                cidadeMaiorIndiceAcidente = cidade;
                maiorIndiceAcidente = indiceAcidentes;
            }

            System.out.println("-----  Menor índice de acidentes: -----");
            System.out.println("Código da cidade: " + codigoMenorIndiceAcidente);
            System.out.println("Nome da cidade: " + cidadeMenorIndiceAcidente);
            System.out.println("Indice de acidentes: (%) " + menorIndiceAcidente);
            System.out.println("---------------");
            System.out.println("----- Maior índice de acidentes:  -----");
            System.out.println("Código da cidade: " + codigoMaiorIndiceAcidente);
            System.out.println("Nome da cidade: " + cidadeMaiorIndiceAcidente);
            System.out.println("Indice de acidentes: (%) " + maiorIndiceAcidente);
            System.out.println("-----------------");
            System.out.println("Media de veiculos total das cidades: "  + totalDeVeiculos / contador);
            System.out.println("media acidentes cidades com menos de 2000 veiculos: "
                    + (acidentesComMenosDe2000Veiculos/quantidadeDeVeiculosCommenos2000)*100);

            contador++;
        }
        scanner.close();
    }
}
