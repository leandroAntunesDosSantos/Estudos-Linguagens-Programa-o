public class Veiculo {
    public Veiculo(String tipo, String cor, Double largura, Double altura) {
        System.out.println("Criando um veículo do tipo " + tipo);
        System.out.println("O veículo é da cor " + cor);
        System.out.println("A largura do veículo é " + largura);
        System.out.println("A altura do veículo é " + altura);
    }

    public void primeiraMarcha() {
        System.out.println("Passando a primeira marcha");
    }

    public void segundaMarcha() {
        System.out.println("Passando a segunda marcha");
    }
}
