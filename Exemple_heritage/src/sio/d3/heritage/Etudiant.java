package sio.d3.heritage;

public class Etudiant extends Personne{

    public  Etudiant(){
        super("nom", "prenom");
        super.verifierPersonne();
    }
}

