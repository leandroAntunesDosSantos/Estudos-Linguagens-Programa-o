package com.leandro.cursojava.aula17;

import java.util.Scanner;

public class NotaAvaliacaoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos alunos serão avaliados: ");
        int alunos = scanner.nextInt();
        scanner.nextLine();

        int contador = 0;

        int respostaCorreta = 0;

        int maiorNotaTurma = 0;
        int menorNotaTurma = 10;

        do {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println("Digite a resposta");
                String resposta = scanner.nextLine();

                if (i == 1 && resposta.equalsIgnoreCase("a")){
                    respostaCorreta ++;
                }
                if (i == 2 && resposta.equalsIgnoreCase("b")){
                    respostaCorreta ++;
                }
                if (i == 3 && resposta.equalsIgnoreCase("c")){
                    respostaCorreta ++;
                }
                if (i == 4 && resposta.equalsIgnoreCase("d")){
                    respostaCorreta ++;
                }
                if (i == 5 && resposta.equalsIgnoreCase("e")){
                    respostaCorreta ++;
                }
                if (i == 6 && resposta.equalsIgnoreCase("e")){
                    respostaCorreta ++;
                }
                if (i == 7 && resposta.equalsIgnoreCase("d")){
                    respostaCorreta ++;
                }
                if (i == 8 && resposta.equalsIgnoreCase("c")){
                    respostaCorreta ++;
                }
                if (i == 9 && resposta.equalsIgnoreCase("b")){
                    respostaCorreta ++;
                }
                if (i == 10 && resposta.equalsIgnoreCase("a")){
                    respostaCorreta ++;
                }
            }
            if (respostaCorreta > maiorNotaTurma){
                maiorNotaTurma = respostaCorreta;
            }
            if (respostaCorreta < menorNotaTurma){
                menorNotaTurma = respostaCorreta;
            }
            System.out.println("Resposta Correta: " + respostaCorreta);
            System.out.println("Maior nota turma: " + maiorNotaTurma);
            System.out.println("Menor nota turma: " + menorNotaTurma);
            System.out.println("Total de alunos que realizaram a prova: " + alunos);
            respostaCorreta = 0;
            contador ++;
        }while (contador < alunos);

        scanner.close();
    }
}
