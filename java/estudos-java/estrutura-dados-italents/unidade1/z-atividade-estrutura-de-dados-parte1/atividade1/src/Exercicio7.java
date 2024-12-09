import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        //jogo da velha
        String[][] tabuleiro = {{ "f ", "f ", "f " }, { "f ", "f ", "f " }, { "f ", "f ", "f " }};
        Scanner scanner = new Scanner(System.in);
        int linha;
        int coluna;
        String jogadorA = "X";
        String jogadorB = "O";
        boolean jogadorAJogar = true;
        int quantidadeJogadas = 0;
        String vencedor = "";
        boolean jogoAcabou = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        System.out.print(tabuleiro[k][l]);
                    }
                    System.out.println();
                }
                do {
                    System.out.println(jogadorAJogar ? "Jogador A, digite a linha deseja jogar:" : "Jogador B, digite a linha deseja jogar:");
                    linha = scanner.nextInt();
                    System.out.println(jogadorAJogar ? "Jogador A, digite a coluna deseja jogar:" : "Jogador B, digite a coluna deseja jogar:");
                    coluna = scanner.nextInt();
                    if (tabuleiro[linha][coluna] != "f ") {
                        System.out.println("Posição já ocupada, tente novamente.");
                    } else {
                        tabuleiro[linha][coluna] = jogadorAJogar ? jogadorA : jogadorB;
                        jogadorAJogar = !jogadorAJogar;
                    }
                    System.out.println("Tabuleiro atual:");
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            System.out.print(tabuleiro[k][l]);
                        }
                        System.out.println();
                    }
                    if (tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2] && tabuleiro[0][0] != "f ") {
                        vencedor = tabuleiro[0][0];
                        jogoAcabou = true;
                    } else if (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2] && tabuleiro[1][0] != "f ") {
                        vencedor = tabuleiro[1][0];
                        jogoAcabou = true;
                    } else if (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2] && tabuleiro[2][0] != "f ") {
                        vencedor = tabuleiro[2][0];
                        jogoAcabou = true;
                    } else if (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0] && tabuleiro[0][0] != "f ") {
                        vencedor = tabuleiro[0][0];
                        jogoAcabou = true;
                    } else if (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1] && tabuleiro[0][1] != "f ") {
                        vencedor = tabuleiro[0][1];
                        jogoAcabou = true;
                    } else if (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2] && tabuleiro[0][2] != "f ") {
                        vencedor = tabuleiro[0][2];
                        jogoAcabou = true;
                    } else if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != "f ") {
                        vencedor = tabuleiro[0][0];
                        jogoAcabou = true;
                    } else if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro [2][0] && tabuleiro[0][2] != "f ") {
                        vencedor = tabuleiro[0][2];
                        jogoAcabou = true;
                    }else if (quantidadeJogadas == 9) {
                        vencedor = "Empate";
                        jogoAcabou = true;
                    }
                    quantidadeJogadas++;
                } while (tabuleiro[linha][coluna] != "f " && quantidadeJogadas < 9 && jogoAcabou == false);
            }
            System.out.println();
        }
        System.out.println("Vencedor: " + vencedor);
        System.out.println("Fim de jogo!");
    }
}
