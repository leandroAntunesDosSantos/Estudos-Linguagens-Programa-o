package com.leandro.cursojava.exerciciosaula15;

import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto:");
        double preco1 = scanner.nextDouble();
        System.out.println("Digite o preço do segundo produto:");
        double preco2 = scanner.nextDouble();
        System.out.println("Digite o preço do terceiro produto:");
        double preco3 = scanner.nextDouble();

        if (preco1 < preco2 && preco1 < preco3){
            System.out.println("Produto que custa " + preco1 + " mais barato");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Produto que custa " + preco2 + " mais barato");
        } else {
            System.out.println("Produto que custa " + preco3 + " mais barato");
        }

        scanner.close();
    }
}
