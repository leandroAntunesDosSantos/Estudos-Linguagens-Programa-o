import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        boolean verificador = true;

        do {
            System.out.println("digite 1 para adicionar uma pessoa");
            System.out.println("Digite 2 para listar as pessoas");
            System.out.println("Digite 3 para sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da pessoa:");
                    String nome = scanner.next();
                    System.out.println("Digite a idade da pessoa:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o endereço da pessoa:");
                    String endereco = scanner.next();
                    Pessoa pessoa = new Pessoa(nome, idade, endereco);
                    pessoas.add(pessoa);
                    break;
                case 2:
                    for (int i = 0; i < pessoas.size(); i++) {
                        pessoas.get(i).Apresentar();
                    }
                    break;
                case 3:
                    verificador = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (verificador);

    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void Apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
    }
}
