public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Tamanho do array: " + numeros.length);
        System.out.println("Número na posição 0: " + numeros[0]);
        System.out.println("Número na posição 1: " + numeros[1]);
        System.out.println("Número na posição 2: " + numeros[2]);
        System.out.println("Número na posição 3: " + numeros[3]);
        System.out.println("Número na posição 4: " + numeros[4]);

        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Pera"};

        System.out.println("Tamanho do array: " + frutas.length);
        System.out.println("Fruta na posição 0: " + frutas[0]);
        System.out.println("Fruta na posição 1: " + frutas[1]);
        System.out.println("Fruta na posição 2: " + frutas[2]);
        System.out.println("Fruta na posição 3: " + frutas[3]);
        System.out.println("Fruta na posição 4: " + frutas[4]);

        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";

        System.out.println("Tamanho do array: " + nomes.length);
        System.out.println("Nome na posição 0: " + nomes[0]);
        System.out.println("Nome na posição 1: " + nomes[1]);
        System.out.println("Nome na posição 2: " + nomes[2]);
    }
}
