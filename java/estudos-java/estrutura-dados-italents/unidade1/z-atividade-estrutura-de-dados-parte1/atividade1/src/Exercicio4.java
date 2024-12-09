import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        boolean sair = false;

        do {
            System.out.println("Digite 1 para adicionar um número");
            System.out.println("Digite 2 para remover o último número adicionado");
            System.out.println("Digite 3 para exibir os números adicionados.");
            System.out.println("Digite 9 para sair.");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um número inteiro:");
                    int numero = scanner.nextInt();
                    numeros.add(numero);
                    break;
                case 2:
                    if (numeros.size() > 0) {
                        numeros.remove(numeros.size() - 1);
                    } else {
                        System.out.println("Não há números para remover.");
                    }
                    break;
                case 3:
                    System.out.println("Números adicionados:");
                    for (int i = 0; i < numeros.size(); i++) {
                        System.out.println(numeros.get(i));
                    }
                    break;
                case 9:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (!sair);
    }
}
