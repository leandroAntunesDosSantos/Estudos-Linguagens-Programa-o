import java.util.ArrayList;
import java.util.List;


public class EstruturaArraylist {
    public static void main(String[] args) {
        //lista cresce dinamicamente e aceita qualquer tipo de dado

        List<Usuario> listaUsuarios = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Usuario usuario = new Usuario("Usuario " + i, "Sobrenome " + i);
            listaUsuarios.add(usuario);
        }

        Usuario usuario = new Usuario("Usuario 5", "Sobrenome 5");
        listaUsuarios.add(2, usuario);

        for (Usuario u : listaUsuarios) {
            System.out.println(u.getNome() + " " + u.getSobrenome());
        }
    }
}
