package sabishiikoto.wordguess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 540);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        Image image = new Image(getClass().getResource("/assets/scrabble.png").toExternalForm());
        // Image credit: <a href="https://www.flaticon.com/free-icons/scrabble" title="scrabble icons">Scrabble icons created by Febrian Hidayat - Flaticon</a>
        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}