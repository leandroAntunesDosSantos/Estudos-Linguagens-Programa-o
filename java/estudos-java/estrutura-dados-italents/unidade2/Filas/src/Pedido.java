import java.util.LinkedList;
import java.util.Queue;

public class Pedido {
    private int nPedido;
    private String[] itens;
    private float valor;

    public Pedido(int nPedido, String[] itens, float valor){
        this.nPedido = nPedido;
        this.itens = itens;
        this.valor = valor;
    }
    public static void main(String[] args) {

        Queue<Pedido> fila = new LinkedList<>();

        String[] itensTempPedido1 = {"X-Buurguer", "Refrigerante", "Batata "};
        Pedido pedido1 = new Pedido(123 ,itensTempPedido1 , 30.45f);

        String[] itensTempPedido2 = {"Cachorro-Quente", "Refrigerante", "Sorvete "};
        Pedido pedido2 = new Pedido(456 ,itensTempPedido2 , 20.24f);

        String[] itensTempPedido3 = {"X-Salada", "Refrigerante", "Batata "};
        Pedido pedido3 = new Pedido(567 ,itensTempPedido3 , 50.45f);

        fila.offer(pedido1);
        fila.offer(pedido2);
        fila.offer(pedido3);

        while (!fila.isEmpty()){
            Pedido pedidoItem = fila.poll();
            System.out.println("Numero do pedido: " + pedidoItem.nPedido);
            System.out.println("Itens: ");
            for (String item : pedidoItem.itens){
                System.out.println("  " + item);
            }
            System.out.println("Numero do pedido: " + pedidoItem.valor);
            System.out.println("------------------------------"
            );
        }
    }
}
