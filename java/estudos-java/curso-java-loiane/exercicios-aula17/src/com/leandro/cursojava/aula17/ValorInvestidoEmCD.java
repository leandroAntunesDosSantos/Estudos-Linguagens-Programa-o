package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class ValorInvestidoEmCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de CDs que você  possui ");
        int quantidade = scanner.nextInt();

        double valorTotal = 0;


        for (int i = 0; i < quantidade ; i++) {
            System.out.println("Quanto você pagou neste CD ");
            double valorCd = scanner.nextDouble();
            valorTotal += valorCd;
        }

        double media = valorTotal / quantidade;
        System.out.println("Valor total gasto em CDs " + valorTotal);
        System.out.println("valor medio gasto por CDs " + media);

        scanner.close();
    }
}
