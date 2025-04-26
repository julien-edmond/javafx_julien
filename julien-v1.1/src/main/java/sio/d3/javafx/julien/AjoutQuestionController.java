package sio.d3.javafx.julien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AjoutQuestionController implements Initializable {
    @FXML
    private Label enonce;
    @FXML
    private TextArea valeur_enonce,valeur_bonne_reponse;
    @FXML
    private HBox hbox1,hbox2;
    public List<Question> collection_questions;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

        hbox1.setStyle("-fx-background-color:cyan;");

        hbox2.setStyle("-fx-background-color:yellow;");
        enonce.setText("Saisir le texte de la question : ");
        collection_questions = new ArrayList<>();

    }


    @FXML
    public void enregistrer(ActionEvent actionEvent)
    {
        String enonce = valeur_enonce.getText();
        String bonne_reponse = valeur_bonne_reponse.getText();

        System.out.println("Enregistrement de la question .... "+enonce+" bonne reponse "+bonne_reponse);

        //création d'un nouvel objet
        Question nouvelle = new Question(enonce,bonne_reponse);

        //ajout de la question dans la listeZ
        AccueilController.getCollection_questions().add(nouvelle);

        //Fermeture de la fenêtre
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }



}

