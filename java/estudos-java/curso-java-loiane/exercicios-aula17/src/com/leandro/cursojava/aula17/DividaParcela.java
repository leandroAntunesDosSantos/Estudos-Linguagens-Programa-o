package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class DividaParcela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da divida: ");
        double divida = scanner.nextDouble();

        System.out.println("digite a quantidade de parcela");
        double quantidadeParcela = scanner.nextDouble();

        double juros;
        double total;

        for (int i = 1; i <= quantidadeParcela ; i++) {
            if (i == 1){
                juros = 0;
                total = divida + (divida * juros) / 100;

                System.out.println("Valor divida  Valor dos Juros  Quantidade de parcelas  Valor da parcela ");
                System.out.println("R$ " + total + "             "
                        + juros + "                "
                        + i + "               R$  "
                        + total / i);

            }
            if (i == 3){
                juros = 10;
                total = divida + (divida * juros) / 100;

                System.out.println("Valor divida  Valor dos Juros  Quantidade de parcelas  Valor da parcela ");
                System.out.println("R$ " + total + "             "
                        + juros + "                "
                        + i + "               R$  "
                        + total / i);

            }
            if (i == 6){
                juros = 15;
                total = divida + (divida * juros) / 100;

                System.out.println("Valor divida  Valor dos Juros  Quantidade de parcelas  Valor da parcela ");
                System.out.println("R$ " + total + "             "
                        + juros + "                "
                        + i + "               R$  "
                        + total / i);

            }
            if (i == 9){
                juros = 20;
                total = divida + (divida * juros) / 100;

                System.out.println("Valor divida  Valor dos Juros  Quantidade de parcelas  Valor da parcela ");
                System.out.println("R$ " + total + "             "
                        + juros + "                "
                        + i + "               R$  "
                        + total / i);

            }
            if (i == 12){
                juros = 25;
                total = divida + (divida * juros) / 100;

                System.out.println("Valor divida  Valor dos Juros  Quantidade de parcelas  Valor da parcela ");
                System.out.println("R$ " + total + "             "
                        + juros + "                "
                        + i + "               R$  "
                        + total / i);

            }
        }
        scanner.close();
    }
}
