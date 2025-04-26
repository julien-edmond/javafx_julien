package sio.d3.javafx.julienr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    public List<Question> collection_questions;
    @FXML
    private HBox hbox1,hbox2;
    @FXML
    private Label enonce;
    @FXML
    private TextArea valeur_enonce,valeur_bonne_reponse;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        hbox1.setStyle("-fx-background-color:cyan;");

        hbox2.setStyle("-fx-background-color:yellow;");
        enonce.setText("Saisir le texte de la question : ");
        collection_questions = new ArrayList<>();
    }
    public Question ajoutQuestion(String enonce,String bonne_reponse) {

        //On va créé un nouvel objet Question à partir des paramètres
        Question nouvelle = new Question(enonce, bonne_reponse);
        //et on va ajouter l'objet dans la liste
        collection_questions.add(nouvelle);

        return nouvelle;
    }
    public String questionToString(){

        String chaine = "";

        for (int i = 0; i < collection_questions.size() ; i++){

            // collection_questions.get(i).toString();
            //ou bien
            Question courante = collection_questions.get(i);
            chaine  = chaine + "\n" + courante.toString2();
        }

        return chaine ;
    }
    public List questionsParNbPropositions(int nb_propositions){

        List liste_Questions = new ArrayList<>();

        for (int i = 0; i < collection_questions.size() ; i++){

            Question courante = collection_questions.get(i);

            if(nb_propositions == courante.getPropositions().size()  ){

                liste_Questions.add(courante);
            }

        }

        return liste_Questions;
    }
    public void ajouterUneQuestion(ActionEvent actionEvent) {

        String enonce =  valeur_enonce.getText();
        String br =  valeur_bonne_reponse.getText();

        ajoutQuestion(enonce,br);

        System.out.println(this.questionToString());

    }
}
