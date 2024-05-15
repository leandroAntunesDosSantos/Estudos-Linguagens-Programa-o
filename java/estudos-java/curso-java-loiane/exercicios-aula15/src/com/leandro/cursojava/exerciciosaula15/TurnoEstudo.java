package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class TurnoEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o turno que voce estuda:");
        String turno = scanner.nextLine();

        if (turno.equals("M")){
            System.out.println("Bom Dia!");
        }
        if (turno.equals("T")){
            System.out.println("Boa Tarde!");
        }
        if (turno.equals("N")){
            System.out.println("Boa Noite!");
        }

        scanner.close();
    }
}
