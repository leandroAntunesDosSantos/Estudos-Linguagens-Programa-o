public class Caminhao implements IVeiculo {
    @Override
    public void primeiraMarcha() {
        System.out.println("Passando a primeira marcha do caminhão");
    }

    @Override
    public void segundaMarcha() {
        System.out.println("Passando a segunda marcha do caminhão");
    }

    @Override
    public void corDoVeiculo(String cor) {
        System.out.println("A cor do caminhão é " + cor);
    }
}
