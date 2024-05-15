package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class LadosTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado de um triangulo: ");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o segundo lado de um triangulo: ");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o terceiro lado de um triangulo: ");
        int lado3 = scanner.nextInt();

        boolean triangulo = false;

        if (lado1 + lado2 > lado3){
            triangulo = true;
        }
        if (lado1 + lado3 > lado2){
            triangulo = true;
        }
        if (lado2 + lado3 > lado1){
            triangulo = true;
        }

        if (triangulo){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Triângulo Equilátero");
            }
            if (lado1 == lado2 && lado2 != lado3){
                System.out.println("Triangulo Isósceles");
            }
            if (lado1 == lado3 && lado3 != lado2){
                System.out.println("Triangulo Isósceles");
            }
            if (lado2 == lado3 && lado3 != lado1){
                System.out.println("Triangulo Isósceles");
            }
            if (lado1 != lado2 && lado2 != lado3){
                System.out.println("Triangulo Escaleno");
            }
        }

        scanner.close();
    }
}
