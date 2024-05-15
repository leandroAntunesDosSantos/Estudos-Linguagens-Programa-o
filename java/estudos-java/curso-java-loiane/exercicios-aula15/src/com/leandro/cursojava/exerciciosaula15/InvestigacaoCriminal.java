package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class InvestigacaoCriminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? ");
        String telefonemaVitima = scanner.next();

        System.out.println("Esteve no local do crime? ");
        String localCrime = scanner.next();

        System.out.println("Mora perto da vítima? ");
        String moraPertoVitima = scanner.next();

        System.out.println("Devia para a vitima? ");
        String dividaVitima = scanner.next();

        System.out.println("Ja trabalhou com a  vitima? ");
        String trabalhoComVitima = scanner.next();

        int contagem = 0;

        if (telefonemaVitima.equals("sim")){
            contagem ++;
        }
        if (localCrime.equals("sim")){
            contagem ++;
        }
        if (moraPertoVitima.equals("sim")){
            contagem ++;
        }
        if (dividaVitima.equals("sim")){
            contagem ++;
        }
        if (trabalhoComVitima.equals("sim")){
            contagem ++;
        }
        System.out.println("quantidade pontos: " + contagem);
        if (contagem < 2){
            System.out.println("Inocente");
        }
        if (contagem == 2){
            System.out.println("Suspeita");
        }
        if (contagem == 3 || contagem == 4){
            System.out.println("Cúmplice");
        }
        if (contagem == 5){
            System.out.println("Assassino");
        }

        scanner.close();
    }
}
