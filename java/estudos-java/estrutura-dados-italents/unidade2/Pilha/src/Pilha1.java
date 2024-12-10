import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha1 {
    public static void main(String[] args) {
        //LAST IN FIRST OUT - LIFO
        Deque<Integer> pilha = new ArrayDeque<>();

        //ADICIONAR ITENS PILHA
        pilha.push(10);
        pilha.push(15);
        pilha.push(13);
        pilha.push(18);
        pilha.push(45);

        System.out.println(pilha);
        System.out.println(pilha.peek()); //VISUALIZA O PRIMEIRO ITEM

        //REMOVE O PRIMEIRO ITEM DA PILHA
        pilha.pop();
        System.out.println(pilha);

        //MOSTRANDO ITENS DA PILHA
        for (int item : pilha) {
            System.out.println(item);
        }

        System.out.println();
        //DESEMPILHANDO A PILHA DE ITENS
        while (!pilha.isEmpty()){
            System.out.println(pilha.pop());
        }
    }
}
