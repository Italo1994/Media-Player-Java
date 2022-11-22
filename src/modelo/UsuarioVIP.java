package modelo;

import java.util.Set;
import java.util.HashSet;

import dao.RepositorioDAO;

public class UsuarioVIP extends Usuario implements IAddDiretorio, IAddFile {
    private Set<Playlist> playlists;

    public UsuarioVIP() {
        super();
        playlists = new HashSet<>();
    }

    public void cadastrarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void cadastrarUsuario(RepositorioDAO repositorio, Usuario usuario) {
        // Usuario usuario = new Usuario();
        repositorio.cadastrarUsuarioNoPlayer(usuario);
    }

    public void getListaPaylists() {
        for(Playlist playlist : playlists) {
            System.out.println("***** LISTA DE PLAYLISTS DO USUÁRIO *****");
            System.out.println("=====================================");
            System.out.println("Nome..: " + playlist.getNome());
            System.out.println("Quantidade de Músicas..: " + playlist.getQuantidadeMusicas());
            System.out.println("=====================================\n");
        }
    }

    @Override
    public void addDiretorio(String dir) {

    }

    @Override
    public void addFile(String file) {
        
    }
}
