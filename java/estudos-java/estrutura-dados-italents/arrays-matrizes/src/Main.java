

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numeros2 = new int[5];

        //Matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matriz2 = new int[2][3];

        //Recorrer matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println();
        }




    }
}
