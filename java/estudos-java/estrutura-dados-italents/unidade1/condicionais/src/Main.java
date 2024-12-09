public class Main {
    public static void main(String[] args) {
        // == igual
        // != diferente
        // < menor
        // > maior
        // <= menor ou igual
        // >= maior ou igual

        //** E lógico (&&) **//
        // true && true -> true
        // OU lógico (||)
        //! negação lógica
        // XOR (ou exclusivo) ^

        int x = 5;
//        if (x < 5) {
//            System.out.println("verdade");
//        } else {
//            System.out.println("mentira");
//        }

        int j = 20;

//        if (j > 10 && j <= 20) {
//            System.out.println("j está entre 10 e 30");
//        }else if (j > 20 || j <= 30) {
//            System.out.println("j é maior que 20 ou menor ou igual a 30");
//        }else {
//            System.out.println("j não está entre 10 e 30");
//        }

        //switch case

        int dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        int b = 10;
        int c = 15;

        if (b == 10 && c == 15) {
            System.out.println("b é igual a 10 e c é igual a 15");
        } else {
            System.out.println("b não é igual a 10 e c não é igual a 15");
        }
    }
}
