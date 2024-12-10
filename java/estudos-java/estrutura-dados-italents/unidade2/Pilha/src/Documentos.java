import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Documentos {
    private String titulo;
    private int nPaginas;

    public Documentos(String titulo, int nPaginas){
        this.titulo = titulo;
        this.nPaginas = nPaginas;
    }
    public static void main(String[] args) {
        Deque<Documentos> pilha = new ArrayDeque<>();

        Documentos documentos1 = new Documentos("Processo 123", 100);
        Documentos documentos2 = new Documentos("Processo 789", 567);
        Documentos documentos3 = new Documentos("Processo 657", 543);
        Documentos documentos4 = new Documentos("Processo 345", 234);

        pilha.push(documentos1);
        pilha.push(documentos2);
        pilha.push(documentos3);
        pilha.push(documentos4);


        while (!pilha.isEmpty()){
            Documentos tempDocumentos = pilha.pop();
            System.out.println("Titulo:         " + tempDocumentos.titulo);
            System.out.println("Número Paginas: " + tempDocumentos.nPaginas);
            System.out.println(" ");
        }

    }
}
