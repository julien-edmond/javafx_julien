package sio.d3.javafx.julienr;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
    //private List propositions;

    private String enonce;
    private String bonne_reponse;
    public List<String> propositions;
    private String proposition1;
    private String proposition2;
    private String proposition3;

    public Question(String ennonce, String bonne_reponse,String proposition1, String proposition2, String proposition3){
        this.enonce = ennonce;
        this.bonne_reponse = bonne_reponse;
        this.propositions = new ArrayList<>();
        this.proposition1 = proposition1;
        this.proposition2 = proposition2;
        this.proposition3 = proposition3;
    }
    public String getEnonce() {
        return enonce;
    }

    public String getProposition1() {
        return proposition1;
    }

    public String getProposition2() {
        return proposition2;
    }

    public String getProposition3() {
        return proposition3;
    }

    public String getBonne_reponse() {
        return bonne_reponse;
    }
    public void ajouterProposition(String proposition){
        this.propositions.add(proposition);
        System.out.println(this.propositions);

    }
    public String toString(){
        return this.enonce+"-"+ this.bonne_reponse+"-"+this.propositions;
    }
    public String toString2(){
        String s = this.enonce+ "-" + this.bonne_reponse + "-";

        for(int i = 0; i < propositions.size(); i++){
            s = s + "-"+propositions.get(i);
        }
        return s;
    }
    public List<String> getPropositions() {
        return propositions;
    }

}
