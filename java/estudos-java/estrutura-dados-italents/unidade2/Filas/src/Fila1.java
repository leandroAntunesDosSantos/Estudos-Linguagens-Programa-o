import java.util.LinkedList;
import java.util.Queue;

public class Fila1 {
    public static void main(String[] args) {
        // FIRST IN FIRST OUT - FIFO

        Queue<String> fila = new LinkedList<>();

        //ADICIONAR ITENS NA FILA
        fila.offer("1 - fila");
        fila.offer("2 - fila");
        fila.offer("3 - fila");

        //EXIBIR A PRIMEIRA POSIÇÃO DA FILA
        System.out.println(fila.peek());

        //REMOVER O PRIMEIRO ITEM DA FILA E EXIBIR ITEM
        System.out.println(fila);

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
