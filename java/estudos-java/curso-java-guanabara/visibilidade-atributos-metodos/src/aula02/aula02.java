package aula02;

import aula03.Caneta;

public class aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.status();
    }
}
