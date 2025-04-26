package sio.d3.javafx.cybersensi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AccueilController implements Initializable{
    @FXML
    private TableView tableViewQuestions;
    private static ObservableList<Question> collection_questions =   FXCollections.observableArrayList();
    @FXML
    private TableColumn<Question, String> enonce;

    @FXML
    private TableColumn<Question, String> bonne_reponse;
    @FXML
    //modif
    private TableColumn<Question, String> proposition1Column;
    @FXML
    private TableColumn<Question, String> proposition2Column;
    @FXML
    private TableColumn<Question, String> proposition3Column;
    //modif



    // Obtenir la taille de l'écran
    double screenWidth = Screen.getPrimary().getBounds().getWidth();
    double screenHeight = Screen.getPrimary().getBounds().getHeight();

    public static ObservableList<Question> getCollection_questions() {
        return collection_questions;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        jeu_de_test();
        tableViewQuestions.setItems(collection_questions);

        enonce.setCellValueFactory(new PropertyValueFactory<>("enonce"));
        bonne_reponse.setCellValueFactory(new PropertyValueFactory<>("bonne_reponse"));

        /*// Liaison des propositions aux colonnes correspondantes
        proposition1Column.setCellValueFactory(cellData ->
                cellData.getValue().getPropositions().size() > 0 ?
                        new javafx.beans.property.SimpleStringProperty(cellData.getValue().getPropositions().get(0)) : null);

        proposition2Column.setCellValueFactory(cellData ->
                cellData.getValue().getPropositions().size() > 1 ?
                        new javafx.beans.property.SimpleStringProperty(cellData.getValue().getPropositions().get(1)) : null);

        proposition3Column.setCellValueFactory(cellData ->
                cellData.getValue().getPropositions().size() > 2 ?
                        new javafx.beans.property.SimpleStringProperty(cellData.getValue().getPropositions().get(2)) : null);*/


        ///lors d'un double clic sur un item (ligne) du tableView, on
        //récupère la question sélectionnée et on la supprime
        tableViewQuestions.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                //si on a effectué plus de un clic
                if (event.getClickCount() > 1) {
                    //récupération de la question sélectionnée
                    Question selectedItem ;
                    selectedItem = (Question) tableViewQuestions.getSelectionModel().getSelectedItem();

                    System.out.println("Suppression de l'item … ");
                    //mise à jour du modèle
                    collection_questions.remove(selectedItem);
                }
            }
        });

    }

    private void jeu_de_test() {
    }

    @FXML
    public void formulaireNouvelleQuestion(ActionEvent actionEvent) {

        Stage stage_ajout = new Stage();
        try
        {
            FXMLLoader root = new FXMLLoader(CyberSensi.class.getResource("ajout_question.fxml"));
            Scene scene = new Scene(root.load(), screenWidth*0.3, screenHeight*0.3);

            stage_ajout.setScene(scene);
            stage_ajout.initOwner(tableViewQuestions.getScene().getWindow());
            stage_ajout.setTitle("Ajout d'une nouvelle question");
            stage_ajout.initModality(Modality.WINDOW_MODAL);
            stage_ajout.show();
        } catch (IOException e) {
            System.err.println(getClass().getName()+" : Il y a une erreur lors de l'affichage de la fenêtre d'ajout.");
            e.printStackTrace();
        }

    }


    @FXML
    protected void onHelloButtonClick() {
        System.out.println("saisie user");

    }




public Question ajoutQuestion(String enonce,String bonne_reponse, String proposition1, String proposition2, String proposition3) {

    //On va créé un nouvel objet Question à partir des paramètres
    Question nouvelle = new Question(enonce, bonne_reponse,proposition1, proposition2, proposition3);
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

    public void jeu_de_test2(){

    }

}
