import java.util.*;

public class BuscaPorProfundidade {
    private Map<String, List<Aresta>> adjacencias;

    public BuscaPorProfundidade(){
        adjacencias = new HashMap<>();
    }

    public Map<String,Boolean> buscaPorProfundidade(String verticeInicial){
        Map<String, Boolean> visitados = new HashMap<>();
        for (String vertice: adjacencias.keySet()) {
            visitados.put(vertice, false);
        }
        dfs(verticeInicial,visitados);
        return visitados;
    }
    public void dfs(String vertice, Map<String, Boolean> visitados){
        visitados.put(vertice, true);
        System.out.print(vertice + " ");

        List<Aresta> vizinhos = adjacencias.get(vertice);
        for (Aresta aresta : vizinhos){
            if (!visitados.get(aresta.getDestino())){
                dfs(aresta.getDestino(), visitados);
            }
        }
    }

    public Map<String, Boolean> buscaPorLargura(String verticeInicial){
        Map<String, Boolean> visitados = new HashMap<>();
        Queue<String> fila = new LinkedList<>();

        for (String vertice : adjacencias.keySet()){
            visitados.put(vertice, false);
        }

        fila.add(verticeInicial);
        visitados.put(verticeInicial, true);

        while (!fila.isEmpty()){
            String verticeAtual = fila.poll();
            System.out.print(verticeAtual + " ");

            List<Aresta> vizinhos = adjacencias.get(verticeAtual);

            for (Aresta aresta : vizinhos){
                if (!visitados.get(aresta.getDestino())){
                    fila.add(aresta.getDestino());
                    visitados.put(aresta.getDestino(),true);
                }
            }
        }
        return visitados;
    }

    public void adicionarVertice(String rotulo){
        adjacencias.put(rotulo, new ArrayList<>());
    }

    public void adicionarAresta(String origem, String destino, int peso){
        if (!adjacencias.containsKey(origem)){
            adicionarVertice(origem);
        }

        if (!adjacencias.containsKey(destino)){
            adicionarVertice(destino);
        }

        adjacencias.get(origem).add(new Aresta(destino,peso));
    }

    public void imprimirGrafo(){
        for (String vertice : adjacencias.keySet()){
            List<Aresta> arestas = adjacencias.get(vertice);
            System.out.print(vertice + " -> ");
            for (Aresta aresta : arestas){
                System.out.print(aresta.getDestino() + "(" + aresta.getPeso() + ") ");
            }
            System.out.println();
        }
    }

    private class Aresta {
        private String destino;
        private int peso;

        public Aresta(String destino, int peso){
            this.destino = destino;
            this.peso = peso;
        }

        public String getDestino(){
            return destino;
        }

        public int getPeso(){
            return peso;
        }
    }

    public static void main(String[] args){
        BuscaPorProfundidade grafos2 = new BuscaPorProfundidade();
        grafos2.adicionarVertice("Brasil");
        grafos2.adicionarVertice("México");
        grafos2.adicionarVertice("Alemanha");
        grafos2.adicionarVertice("Portugal");
        grafos2.adicionarVertice("Inglaterra");

        grafos2.adicionarAresta("Brasil", "Japão", 5);
        grafos2.adicionarAresta("Alemanha", "Portugal", 3);
        grafos2.adicionarAresta("Portugal", "Alemanha", 5);
        grafos2.adicionarAresta("Brasil", "México", 7);
        grafos2.adicionarAresta("Inglaterra", "México", 2);
        grafos2.adicionarAresta("Brasil", "Inglaterra", 5);

        //grafos2.imprimirGrafo();
        grafos2.buscaPorProfundidade("Brasil");

    }

}
