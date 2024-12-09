class Objeto {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Objeto(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public void testarAltura(float alturaTest){
        if (alturaTest <= this.altura){
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }
    }

    public void testarIdade(){
        if(this.idade >= 18){
            System.out.println("maior de idade autorizado");
        } else {
            System.out.println("Menor de idade não autorizado");
        }
    }

    public float testImc(){
        return this.peso / (this.altura * this.altura);
    }

    public String testImc2(){
        if (testImc() < 18.5){
            return "Abaixo do peso";
        } else if (testImc() >= 18.5 && testImc() < 24.9){
            return "Peso normal";
        } else if (testImc() >= 25 && testImc() < 29.9){
            return "Sobrepeso";
        } else if (testImc() >= 30 && testImc() < 34.9){
            return "Obesidade grau 1";
        } else if (testImc() >= 35 && testImc() < 39.9){
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

    public void setNome(String nome){
        System.out.println("Nome: " + nome);
    }

    public static void main(String[] args) {
        Objeto pessoa = new Objeto("Leandro", 18, 70.5f, 1.75f);
        pessoa.exibirInfos();
        pessoa.testarAltura(1.50f);
        pessoa.testarIdade();
        System.out.println("IMC: " + pessoa.testImc());
        System.out.println("Classificação IMC: " + pessoa.testImc2());
    }
}
