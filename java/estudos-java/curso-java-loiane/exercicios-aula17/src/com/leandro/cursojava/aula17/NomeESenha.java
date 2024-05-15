package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class NomeESenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validacao = false;

        do {
            System.out.println("Digite o nome de usuário: ");
            String nome = scanner.next();

            System.out.println("Digite a sua senha: ");
            String senha = scanner.next();

            if (nome.equals(senha)){
                validacao = false;
                System.out.println("Usuário ou senha invalido por favor digite novamente! ");
            }else {
                validacao = true;
                System.out.println("Seja bem vindo(a)");
            }
        }while (validacao == false);
        scanner.close();
    }
}
