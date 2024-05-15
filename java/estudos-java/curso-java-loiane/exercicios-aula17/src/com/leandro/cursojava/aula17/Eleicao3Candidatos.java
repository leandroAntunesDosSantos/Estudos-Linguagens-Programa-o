package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class Eleicao3Candidatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos eleitores votaram: ");
        int eleitores = scanner.nextInt();

        int somaCandidatoA = 0;
        int somaCandidatoB = 0;
        int somaCandidatoC = 0;

        for (int i = 0; i < eleitores ; i++) {
            System.out.println("Em qual candidato voce quer votar: ");
            String voto = scanner.next();

            if (voto.equalsIgnoreCase("a")){
                somaCandidatoA ++;
            }
            if (voto.equalsIgnoreCase("b")){
                somaCandidatoB ++;
            }
            if (voto.equalsIgnoreCase("c")){
                somaCandidatoC++;
            }
        }
        System.out.println("Votos no candidato A: " + somaCandidatoA);
        System.out.println("Votos no candidato B: " + somaCandidatoB);
        System.out.println("Votos no candidato C: " + somaCandidatoC);

        scanner.close();
    }
}
