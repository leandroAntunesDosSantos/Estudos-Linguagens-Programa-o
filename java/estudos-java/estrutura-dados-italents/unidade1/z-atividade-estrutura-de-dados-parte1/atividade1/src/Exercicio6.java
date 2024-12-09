import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i < 100 ; i++) {
            boolean numeroPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numeroPrimo = false;
                    break;
                }
            }

            if (numeroPrimo) {
                numeros.add(i);
            }
        }

        System.out.println("Números primos de 1 a 100:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }
}
