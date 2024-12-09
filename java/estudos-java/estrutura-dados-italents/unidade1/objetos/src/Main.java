class Objeto {
    //atributos private, public, protected
    private String nome;
    private int idade;
    private float peso;

    //construtor
    public Objeto(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //métodos
    public void exibirInfos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
    }


    public static void main(String[] args) {
        Objeto pessoa = new Objeto("João", 20, 70.5f);
        Objeto pessoa2 = new Objeto("Maria", 35, 74.5f);

        pessoa.exibirInfos();
        System.out.println("===================================");
        pessoa2.exibirInfos();
    }
}
