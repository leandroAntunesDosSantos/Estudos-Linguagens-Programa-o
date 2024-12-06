//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tipos de dados primitivos
        //números inteiros
        byte valorByte = 127;   // maximo valor de byte (127) e minimo (-128) - 8 bits
        short valorShort = 32767; // maximo valor de short (32767) e minimo (-32768) - dobro do byte - 16 bits
        int valorInt = 2147483647; // maximo valor de int (2147483647) e minimo (-2147483648) - dobro do short - 32 bits
        long valorLong = 9223372036854775807L; // maximo valor de long (9223372036854775807) e minimo (-9223372036854775808) - dobro do int - 64 bits

        //numeros decimais
        float valorFloat = 3.4028235E38F; // maximo valor de float (3.4028235E38) e minimo (-3.4028235E38) - 32 bits
        double valorDouble = 1.7976931348623157E308; // maximo valor de double (1.7976931348623157E308) e minimo (-1.7976931348623157E308) - 64 bits

        //caracteres
        char valorChar = 'A'; // 16 bits - aspas simples

        //boolean
        boolean valorBoolean = true; // 1 bit

        System.out.println("Valor byte: " + valorByte);

    }
}
