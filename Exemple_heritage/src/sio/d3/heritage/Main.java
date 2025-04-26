package sio.d3.heritage;
public class Main {

    public static void main(String[] args) {

        Enseignant prof = new Enseignant("","");
        Etudiant etu = new Etudiant();
        Personne p = new Personne("","");

        prof.setNumen("878UIA7");
        prof.setNom("Leprof");
        prof.setPrenom("Luc");

        etu.setNom("Letudiant");
        etu.setPrenom("Line");

        System.out.println("Le professeur est "+prof.getPrenom()+" "+prof.getNom()+" de numen "+prof.getNumen());
        System.out.println("L'étudiant est "+etu.getPrenom()+" "+etu.getNom());

        p.setNom("Nietuniprof");
        p.setPrenom("Lambda");
        System.out.println("Cette personne est "+p.getPrenom()+" "+p.getNom());
    }
}
