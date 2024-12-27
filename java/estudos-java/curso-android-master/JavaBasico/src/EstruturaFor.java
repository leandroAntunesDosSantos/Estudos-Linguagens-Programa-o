public class EstruturaFor {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posição " + i + ": " + nomes[i]);
        }
    }
}
