import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();


        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            CofreDigital cofre = new CofreDigital(senha);
            cofre.imprimirInformacoes();
            int confirmaSenha = scanner.nextInt();
            if (!cofre.validarSenha(confirmaSenha)) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Cofre aberto!");
            }
        } else {
            CofreFisico cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }

        scanner.close(); // Certificando de fechar o scanner no final para evitar leaks de memoria
    }
}
