package com.leandro.aulajava.aula18;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite um numero ");
//        int numero = scanner.nextInt();
//
//        System.out.println("Digite um limite: ");
//        int limite = scanner.nextInt();
//
//        for (int i = numero; i < limite; i++) {
//            System.out.println(i);
//            if (i % 7 == 0){
//                System.out.println("O valpr de i é: " + i);
//                break;
//            }
//        }

//        for (int i = 0; i <=4 ; i++) {
//            rotulo1: {
//                rotulo2:{
//                    rotulo3: {
//                        if (i == 1){
//                            break rotulo1;
//                        }
//                        if (i == 2){
//                            break rotulo2;
//                        }
//                        if (i == 3){
//                            break rotulo3;
//                        }
//                        System.out.println("rotulo3" );
//                    }
//                    System.out.println("rotulo2");
//                }
//                System.out.println("rotulo1");
//            }
//            System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int numero = scanner.nextInt();

        System.out.println("Digite um limite: ");
        int limite = scanner.nextInt();

        for (int i = numero; i < limite; i++) {
            if (i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
