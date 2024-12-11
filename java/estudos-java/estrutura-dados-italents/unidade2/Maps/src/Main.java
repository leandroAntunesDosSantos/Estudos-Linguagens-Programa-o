import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        //ADICIONA NO MAPA A CHAVE E VALOR (K,V)
        mapa.put("Leonardo", 30);
        mapa.put("Mariana", 45);
        mapa.put("Jonas", 23);
        System.out.println(mapa);

        System.out.println(mapa.get("Leonardo")); //retorna o valor da chave

        mapa.replace("Jonas", 78);  //altera o valor da chave e se nao encontrar nada nao modifica o valor
        System.out.println(mapa);

        mapa.putIfAbsent("Maria", 22);
        System.out.println(mapa);

        mapa.remove("Leonardo");
        System.out.println(mapa);

        if (mapa.containsKey("Leo")) {
            System.out.println("existe");
        }else {
            System.out.println("Nao existe");
        }

        if(mapa.containsValue(22)){
            System.out.println("existe");
        }else {
            System.out.println("nao existe");
        }

        if (mapa.isEmpty()){
            System.out.println("mapa vazio");
        }else {
            System.out.println("mapa noa esta vazio");
        }
        System.out.println();
        for (String nome : mapa.keySet()){
            System.out.println(nome);
        }

        int tamanho = mapa.size();
        System.out.println("Tamanho mapa: " + tamanho);
    }
}
