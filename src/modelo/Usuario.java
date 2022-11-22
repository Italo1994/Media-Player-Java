package modelo;

public class Usuario {
    protected static int ID;
    protected String nome;
    protected String status;

    public Usuario() {
        ID++;
        nome = "";
        status = "";
    }

    public Usuario(String nome, String status) {
        this.nome = nome;
        this.status = status;
    }

    public int getId() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
