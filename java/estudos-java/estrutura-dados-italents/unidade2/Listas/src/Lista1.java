import java.util.ArrayList;

public class Lista1 {
    public static void main(String[] args) {
       String[] listaCompras = new String[3];
       //adiciona itens na lista estática
       listaCompras[0] = "banana";
       listaCompras[1] = "Tomate";
       listaCompras[2] = "Pera";

        ArrayList<String> ListaComprasUpgrade = new ArrayList<>();
        //adicionar itens novos a lista dinâmica
        ListaComprasUpgrade.add("Queijo coalho");
        ListaComprasUpgrade.add("Presunto");
        ListaComprasUpgrade.add("Pão");
        ListaComprasUpgrade.add("Maionese");
        ListaComprasUpgrade.add("Tomate");

        //visualiza um item
        System.out.println(listaCompras[1]);
        System.out.println(ListaComprasUpgrade.get(1));

        //quantidade de itens na lista
        System.out.println(listaCompras.length);
        System.out.println(ListaComprasUpgrade.size());

        //verificar se o item foi adicionado retorna um boolean
        System.out.println(ListaComprasUpgrade.contains("Presunto"));
        System.out.println(ListaComprasUpgrade.contains("Alface"));

        //remover itens da lista pode ser por nome ou índice
        System.out.println(ListaComprasUpgrade.remove("Tomate"));
        System.out.println(ListaComprasUpgrade.removeFirst());
        System.out.println(ListaComprasUpgrade);

        //limpa a lista inteira deixando vazia
        ListaComprasUpgrade.clear();
        System.out.println(ListaComprasUpgrade);

    }
}
