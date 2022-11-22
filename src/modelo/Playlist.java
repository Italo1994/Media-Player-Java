package modelo;

import java.util.List;
import java.util.ArrayList;

public class Playlist {
    private String nome;
    private static int QUANTIDADE_DE_MUSICAS;
    private List<Musica> musicas;

    public Playlist() {
        musicas = new ArrayList<>();
        QUANTIDADE_DE_MUSICAS++;
    }

    public Playlist(String nome) {
        this.nome = nome;
        musicas = new ArrayList<>();
        QUANTIDADE_DE_MUSICAS++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeMusicas() {
        return QUANTIDADE_DE_MUSICAS;
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    public void exibirMusicas() {
        for(Musica musica : musicas) {
            System.out.println("***** MÚSICAS DA PLAYLIST *****");
            System.out.println("=====================================");
            System.out.println("Nome..: " + musica.getNome());
            System.out.println("Artista..: " + musica.getArtista());
            System.out.println("Gênero..: " + musica.getGenero());
            System.out.println("Ano..: " + musica.getAno());
            System.out.println("=====================================\n");
        }
    }
}
