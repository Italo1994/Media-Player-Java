package modelo;

import java.io.File;

public class Musica {
    private String nome;
    private String artista;
    private String genero;
    private int ano;
    private File file;

    public Musica() {

    }

    public Musica(String nome, String artista, String genero, int ano) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public File getFile() {
        return file;
    }
}
