package sio.d3.poojava;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Entreprise objet1;
        Entreprise objet2;
        objet1 = new Entreprise(18);
        objet2 = new Entreprise(15, 25,5, 7);

        objet1.calculer();
        objet2.calculer();
        
        objet1.affiche();
        objet2.affiche();

    }

}
