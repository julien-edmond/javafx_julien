package sio.d3.javafx.cybersensi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Screen;
import java.io.IOException;

public class CyberSensi extends Application {

    // Obtenir la taille de l'écran

    @Override
    public void start(Stage stage) throws IOException
    {
        double screenWidth = Screen.getPrimary().getBounds().getWidth();
        double screenHeight = Screen.getPrimary().getBounds().getHeight();


        FXMLLoader fxmlLoader = new FXMLLoader(CyberSensi.class.getResource("accueil.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),  screenWidth*0.5, screenHeight*0.5);
        stage.setTitle("Quizz de cYbersécurité");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}