package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class ConvenienciaSeuManuelJoaquim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean validate = true;

        double produto;

        double soma = 0;

        do {
            System.out.println("Digite o numero do produto: ");
            int numero = scanner.nextInt();

            switch (numero){
                case 0:
                    produto = 0.00;
                    System.out.println("Compra Finalizada: ");
                    soma += produto;
                    validate = false;
                    break;
                case 1:
                    produto = 2.20;
                    System.out.println("Produto 1: R$ " + produto );
                    soma += produto;
                    break;
                case 2:
                    produto = 5.80;
                    System.out.println("Produto 2: R$ " + produto );
                    soma += produto;
                    break;
                case 3:
                    produto = 5.10;
                    System.out.println("Produto 3: R$ " + produto );
                    soma += produto;
                    break;
                default:
                    System.out.println("Produto invalido");
                    break;
            }
        }while (validate);

        System.out.println("Total: " + soma);

        System.out.println("Qual o valor em dinheiro para o pagamento? ");
        double dinheiro = scanner.nextInt();

        if (dinheiro < soma){
            System.out.println("O dinheiro é menor que o valor da compra");
        }else {
            double troco = dinheiro - soma;
            System.out.println("Troco: R$ " + troco);
        }

        scanner.close();
    }

}
