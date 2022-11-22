package dao;

import modelo.*;
import java.util.List;
import java.util.ArrayList;

public class RepositorioDAO {
    private List<Usuario> usuarios;

    public RepositorioDAO() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuarioNoPlayer(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void exibirUsuarios() {
        for(Usuario user : usuarios) {
            System.out.println(user.getNome());
            System.out.println("\n");
        }
    }
}
