import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();
        System.out.println("Digite o saldo do titular: ");
        double saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        System.out.println("Informacoes:");

        System.out.println("Conta: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
