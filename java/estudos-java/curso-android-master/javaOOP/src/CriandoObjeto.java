public class CriandoObjeto {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.primeiraMarcha();
        carro.segundaMarcha();
        carro.corDoVeiculo("vermelho");
        System.out.println("====================================");

        Caminhao caminhao = new Caminhao();
        caminhao.primeiraMarcha();
        caminhao.segundaMarcha();
        caminhao.corDoVeiculo("azul");
    }
}


