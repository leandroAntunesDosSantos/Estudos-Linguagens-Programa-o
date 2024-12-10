import java.util.ArrayList;

public class Lista2 {
    public static void main(String[] args){
        ArrayList<String> ListaComprasUpgrade = new ArrayList<>();
        //adicionar itens novos a lista dinâmica
        ListaComprasUpgrade.add("Queijo coalho");
        ListaComprasUpgrade.add("Presunto");
        ListaComprasUpgrade.add("Pão");
        ListaComprasUpgrade.add("Maionese");
        ListaComprasUpgrade.add("Tomate");

        ArrayList<String> ListaLanches = (ArrayList<String>) ListaComprasUpgrade.clone(); //cast

        System.out.println(ListaLanches);
        ListaLanches.add("Cebola");
        ListaLanches.add("Requeijão");
        System.out.println(ListaLanches);

        System.out.println(ListaComprasUpgrade.size());
        System.out.println(ListaComprasUpgrade.isEmpty());
        ListaComprasUpgrade.clear();
        System.out.println(ListaComprasUpgrade.size());
        System.out.println(ListaComprasUpgrade.isEmpty());
        System.out.println(ListaLanches);

        for (String item : ListaLanches) {
            System.out.println(item);
        }

        boolean existe = false;
        for (String item : ListaLanches) {
            if (item == "Presunto") {
                existe = true;
            }
        }
        String verificacao = existe ? "item encontrado ": "Item não encontrado ";
        System.out.println(verificacao);


    }
}
