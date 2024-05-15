package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class Metereologia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validate = true;

        double menorTemp = 1_000_000;
        double maiorTemp = - 1_000_000;

        double contador = 0;
        double somaTemp = 0;

        while (validate){
            contador++;
            System.out.println("Digite a temperatura ");
            double temperatura = scanner.nextDouble();

            somaTemp += temperatura;

            if (temperatura < menorTemp){
                menorTemp = temperatura;
            }
            if (temperatura > maiorTemp ){
                maiorTemp = temperatura;
            }
            System.out.println("Menor Temperatura: " + menorTemp);
            System.out.println("Maior Temperatura: " + maiorTemp);
            System.out.println("Media Temperatura: " + somaTemp / contador);

        }
        
        scanner.close();
    }
}
