package sio.d3.heritage;


public class Personne {

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.verifierPersonne();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    protected void verifierPersonne(){
        System.out.println("Nouvel objet crée : "+ this.nom+" "+this.prenom);
    }
}
