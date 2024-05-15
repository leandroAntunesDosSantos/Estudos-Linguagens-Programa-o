package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class HipermercadoTabajara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de carne a ser levada: ");
        String tipoCarne = scanner.next();

        System.out.println("Digite a quantidade de carne a ser levada: ");
        double quantidadeCarne = scanner.nextDouble();

        System.out.println("Possui o cartão tabajara? ");
        String cartaoTabajara = scanner.next();

        double carneEscolhida = 0;

        if (tipoCarne.equals("file") && quantidadeCarne <= 5){
            carneEscolhida = 4.9;
        }else if (tipoCarne.equals("file") && quantidadeCarne > 5){
            carneEscolhida = 5.8;
        }

        if (tipoCarne.equals("alcatra") && quantidadeCarne <= 5){
            carneEscolhida = 5.9;
        }else if (tipoCarne.equals("alcatra") && quantidadeCarne > 5){
            carneEscolhida = 6.8;
        }
        if (tipoCarne.equals("picanha") && quantidadeCarne <= 5){
            carneEscolhida = 6.9;
        }else if (tipoCarne.equals("picanha") && quantidadeCarne > 5){
            carneEscolhida = 7.8;
        }

        double valorNormal = carneEscolhida * quantidadeCarne;
        double valorComDesconto = valorNormal;

        if (cartaoTabajara.equals("sim")){
            valorComDesconto = valorNormal - (valorNormal * 10)/100;
        }

        System.out.println(carneEscolhida);
        System.out.println(valorNormal);
        System.out.println(valorComDesconto);

        scanner.close();
    }
}
