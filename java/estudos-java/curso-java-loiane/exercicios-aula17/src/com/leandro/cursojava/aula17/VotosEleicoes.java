package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class VotosEleicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validate = true;

        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        int totalDeVotos = 0;

        do {
            System.out.println("Digite o numero do candidato: ");
            int numero = scanner.nextInt();

            switch (numero){
                case 1:
                    System.out.println("1 - Joao da banquinha ");
                    voto1 ++;
                    totalDeVotos ++;
                    break;
                case 2:
                    System.out.println("2 - Maria costureira ");
                    voto2 ++;
                    totalDeVotos ++;
                    break;
                case 3:
                    System.out.println("3 - Pedrão do caminhão ");
                    voto3 ++;
                    totalDeVotos ++;
                    break;
                case 4:
                    System.out.println("4 - Rebeca da casa 20");
                    voto4 ++;
                    totalDeVotos ++;
                    break;
                case 5:
                    System.out.println("voto nulo");
                    votoNulo ++;
                    totalDeVotos ++;
                    break;
                case 6:
                    System.out.println("Voto Branco");
                    votoBranco ++;
                    totalDeVotos ++;
                    break;
                case 99:
                    System.out.println("Votação encerrada ");
                    validate = false;
                default:
                    System.out.println("Voto inválido ");
            }

            System.out.println("Voto no candidato 1: " + voto1);
            System.out.println("Voto no candidato 2: " + voto2);
            System.out.println("Voto no candidato 3: " + voto3);
            System.out.println("Voto no candidato 4: " + voto4);
            System.out.println("Voto nulo : " + votoNulo);
            System.out.println("Voto em branco: " + votoBranco);
            System.out.println("Total de votos: " + totalDeVotos);

        }while (validate);
        scanner.close();
    }
}
