//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //tipo primitivos
        final float nPi = 3.14159f;  // final valor constante nao pode ser alterado
        char caracter = 'A'; // char armazena um caractere

        //tipo não primitivos
        String nome = "Leandro"; // String armazena uma cadeia de caracteres
        nome = "Leandro Silva";

        //tipo enum palavras ue irao se repetir ocasionalmente exemplo dias da semana
        enum DiaDaSemana{
            SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
        }

        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        //tipo Array
        int[] numeros = new int[5]; // Array de inteiros com 5 posições
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
