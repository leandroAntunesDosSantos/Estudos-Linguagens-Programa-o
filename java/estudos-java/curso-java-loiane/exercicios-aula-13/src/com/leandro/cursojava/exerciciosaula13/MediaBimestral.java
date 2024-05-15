package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a N1: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a N2: ");
        double n2 = scanner.nextDouble();


        System.out.println("Digite a N3: ");
        double n3 = scanner.nextDouble();


        System.out.println("Digite a N4: ");
        double n4 = scanner.nextDouble();


        double media = (n1 + n2 + n3 + n4)/4;


        System.out.println("A media das notas bimestrais foram: " + media);

    }
}
