package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class SaltoEmDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos atletas estarão competindo: ");
        int competidores = scanner.nextInt();

        int contador = 0;

        String nomeAtleta = null;

        double primeiroSalto = 0;
        double segundoSalto = 0;
        double terceiroSalto = 0;
        double quartoSalto = 0;
        double quintoSalto = 0;

        double maiorDistancia = 0;
        double menorDistancia = 1000;
        double distanciaTotal = 0;

        do {
            System.out.println("Digite o nome do atleta: ");
            nomeAtleta = scanner.next();
            

            for (int i = 0; i < 5; i++) {
                System.out.println("Digite a distancia do salto ");
                double distancia = scanner.nextDouble();
                if (i == 0){
                    primeiroSalto = distancia;
                }
                if (i == 1){
                    segundoSalto = distancia;
                }
                if (i == 2){
                    terceiroSalto = distancia;
                }
                if (i == 3){
                    quartoSalto = distancia;
                }
                if (i == 4){
                    quintoSalto = distancia;
                }

                if (distancia > maiorDistancia){
                    maiorDistancia = distancia;
                }
                if (distancia < menorDistancia){
                    menorDistancia = distancia;
                }
                distanciaTotal += distancia;
            }
            System.out.println("Atleta: " + nomeAtleta);

            System.out.println("Primeiro salto: " + primeiroSalto + " m");
            System.out.println("Segundo salto: " + segundoSalto + " m");
            System.out.println("Terceiro salto: " + terceiroSalto + " m");
            System.out.println("Quarto salto: " + quartoSalto + " m");
            System.out.println("Quinto salto: " + quintoSalto + " m");
            System.out.println("----------------------");
            System.out.println("Melhor salto: " + maiorDistancia + " m");
            System.out.println("Pior salto: " + menorDistancia + " m");
            System.out.println("Media dos demais saltos: " + (distanciaTotal - maiorDistancia - menorDistancia)/3 + " m");
            System.out.println("----------------------");
            System.out.println("Resultado final: ");
            System.out.println(nomeAtleta + ": " + (distanciaTotal - maiorDistancia - menorDistancia)/3 + " m");
            maiorDistancia = 0;
            menorDistancia = 1000;
            distanciaTotal = 0;

            contador ++;
        }while (contador < competidores);
        
        scanner.close();
    }
}
