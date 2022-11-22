import java.beans.EventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import modelo.Playlist;
import modelo.Usuario;
import modelo.UsuarioVIP;
import modelo.Musica;
import dao.RepositorioDAO;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);

        RepositorioDAO dao = new RepositorioDAO();

        Musica musica1 = new Musica("Hello", "Adele", "Pop", 2016);

        Playlist playlist1 = new Playlist("Playlist 1");
        playlist1.addMusica(musica1);

        Usuario user = new UsuarioVIP();
        Usuario user2 = new Usuario("USER 2", "Ativo");

        ((UsuarioVIP)user).cadastrarUsuario(dao, user2);
        ((UsuarioVIP)user).cadastrarPlaylist(playlist1);

        ((UsuarioVIP)user).getListaPaylists();
        dao.exibirUsuarios();
    }

   
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Player");
        Button botao = new Button("Clique!");

        StackPane layout = new StackPane();
        layout.getChildren().addAll(botao);
        layout.setAlignment(Pos.CENTER);

        stage.setScene(new Scene(layout, 300, 250));
        stage.show();
    }
}
