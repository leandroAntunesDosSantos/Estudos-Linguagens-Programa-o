public class EstruturaWhile {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";

        int i = 0;
        while (i < nomes.length) {
            System.out.println("Nome na posição " + i + ": " + nomes[i]);
            i++;
        }
    }
}
