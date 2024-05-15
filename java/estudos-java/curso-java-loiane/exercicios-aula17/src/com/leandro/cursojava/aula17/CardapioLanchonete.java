package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class CardapioLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validate = true;

        int codigoPedido = 0;
        int quantidadePedido = 0;
        String nomePedido = null;
        double precoDoPedido = 0;

        double totalPedido = 0;

        do {
            System.out.println("Digite o código do pedido por favor: ");
            int codigo = scanner.nextInt();

            System.out.println("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            switch (codigo){
                case 55:
                    System.out.println("Pedido encerrado ");
                    validate = false;
                    break;
                case 100:
                    nomePedido = "Cachorro Quente";
                    codigoPedido = codigo;
                    quantidadePedido = quantidade;
                    precoDoPedido = 1.2;
                    totalPedido += precoDoPedido * quantidadePedido;
                    break;
                case 101:
                    nomePedido = "Bauru Simples";
                    codigoPedido = codigo;
                    quantidadePedido = quantidade;
                    precoDoPedido = 1.3;
                    totalPedido += precoDoPedido * quantidadePedido;
                    break;
                case 102:
                    nomePedido = "Bauru Com Ovo";
                    codigoPedido = codigo;
                    quantidadePedido = quantidade;
                    precoDoPedido = 1.5;
                    totalPedido += precoDoPedido * quantidadePedido;
                    break;
                case 103:
                    nomePedido = "Hambúrguer";
                    codigoPedido = codigo;
                    quantidadePedido = quantidade;
                    precoDoPedido = 1.2;
                    totalPedido += precoDoPedido * quantidadePedido;
                    break;
                case 104:
                    nomePedido = "Cheeseburguer";
                    codigoPedido = codigo;
                    quantidadePedido = quantidade;
                    precoDoPedido = 1.3;
                    totalPedido += precoDoPedido * quantidadePedido;
                    break;
                case 105:
                    nomePedido = "Refrigerante";
                    codigoPedido = codigo;
                    quantidadePedido = quantidade;
                    precoDoPedido = 1;
                    totalPedido += precoDoPedido * quantidadePedido;
                    break;
                default:
                    System.out.println("Numero invalido");
            }

            System.out.println("Código do pedido: " + codigoPedido);
            System.out.println("Especificações: " + nomePedido);
            System.out.println("Preço: R$ " + precoDoPedido);
            System.out.println("Quantidade do pedido: " + quantidadePedido);
            System.out.println("Total: R$ " + totalPedido);

        }while (validate);
        scanner.close();
        System.out.println("Total do pedido: R$ " + totalPedido);
    }
}
