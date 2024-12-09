import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;
    private float peso;

    public Pessoa(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void exibirInfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
    }

    public void fazerAniversario() {
        this.idade += 1;
    }

    //gets e sets
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa("João", 20, 70.5f);
//        pessoa.exibirInfos();
//        pessoa.fazerAniversario();
//        pessoa.exibirInfos();

//        pessoa.setNome("joãozinho");
//        pessoa.setPeso(80.5f);
//        pessoa.exibirInfos();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o peso: ");
        float peso = Float.parseFloat(scanner.nextLine());

        Pessoa pessoa2 = new Pessoa(nome, idade, peso);
        pessoa2.exibirInfos();

        scanner.close();
    }
}
