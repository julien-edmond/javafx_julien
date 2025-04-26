package sio.d3.heritage;

public class Enseignant extends Personne{
    private String numen;

    public Enseignant(String nom, String prenom) {
        super(nom, prenom);
        this.verifierPersonne();
    }

    public String getNumen() {
        return numen;
    }

    public void setNumen(String numen) {
        this.numen = numen;
    }
    @Override
    protected  void verifierPersonne(){
        super.verifierPersonne();
        System.out.println("Numen : "+this.numen);
    }
}