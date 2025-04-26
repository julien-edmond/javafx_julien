package sio.d3.javafx.julien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Question {
    private String ennonce;
    private String bonne_reponse;
    public List<String> propositions;
    private String proposition;


    public Question(String ennonce, String bonne_reponse){
        this.ennonce = ennonce;
        this.bonne_reponse = bonne_reponse;
        //this.propositions = new ArrayList<>();
    }
    public void ajouterProposition(String proposition){
        this.propositions.add(proposition);
        System.out.println(this.propositions);

    }

    public List<String> getPropositions() {
        return propositions;
    }



    public String toString(){
        return this.ennonce+"-"+ this.bonne_reponse+"-"+this.propositions;
    }
    public String toString2(){
        String s = this.ennonce+ "-" + this.bonne_reponse + "-";

        for(int i = 0; i < propositions.size(); i++){
            s = s + "-"+propositions.get(i);
        }
        return s;
    }

}
