import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }
        // o mais repetido

        int maisRepetido = 0;
        int quantidadeRepeticoes = 0;
        for (int i = 0; i < 5; i++) {
            int quantidadeRepeticoesAtual = 0;
            for (int j = 0; j < 5; j++) {
                if (numeros[i] == numeros[j]) {
                    quantidadeRepeticoesAtual++;
                }
            }
            if (quantidadeRepeticoesAtual > quantidadeRepeticoes) {
                quantidadeRepeticoes = quantidadeRepeticoesAtual;
                maisRepetido = numeros[i];
            }
        }
        System.out.println("O número mais repetido é: " + maisRepetido);
    }
}
