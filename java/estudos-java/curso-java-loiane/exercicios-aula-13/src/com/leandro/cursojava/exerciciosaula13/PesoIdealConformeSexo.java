package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class PesoIdealConformeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o seu sexo: ");
        String sexo = scanner.nextLine();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();


        double pesoideal = 0;

        if (sexo.equals("m")){
            pesoideal = (72.7 * altura) - 58;
        }
        if (sexo.equals("f")){
           pesoideal = (62.1 * altura) - 44.7;
        }

        if (peso>pesoideal){
            System.out.println("Acima do peso ideal ");
        }
        if (peso<pesoideal){
            System.out.println("Abaixo do peso ideal ");
        }
        if (peso == pesoideal){
            System.out.println("dentro do peso ideal ");
        }
    }
}
