public class Carro implements IVeiculo {
    @Override
    public void primeiraMarcha() {
        System.out.println("Passando a primeira marcha do carro");
    }

    @Override
    public void segundaMarcha() {
        System.out.println("Passando a segunda marcha do carro");
    }

    @Override
    public void corDoVeiculo(String cor) {
        System.out.println("A cor do carro é " + cor);
    }
}
