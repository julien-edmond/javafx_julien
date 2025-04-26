package sio.d3.tp1;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int numpank;
        int farine;
        int oeufs;
        int beurre;
        int lait;
        int levure;
        int sucre;
        int sel;
        float Ifarine;
        float Ioeufs;
        float Ibeurre;
        float Ilait;
        float Ilevure;
        float Isucre;
        float Isel;
        float multiplicateur;
        float ingredients;
        farine = 250;
        oeufs = 3;
        beurre = 60;
        lait = 25;
        levure = 1;
        sucre = 2;
        sel = 1;
        System.out.println("Quelle quantité de pankakes souhaitez vous:");
        numpank = lec.nextInt();
        if(numpank < 15){
            System.out.println("Le nombre de panakaes doit etre supérieur à 15");
        }
        else
        {
            if(numpank % 15 != 0){
                System.out.println("Le nombre de pankakes doit etre un multiple de 15");
            }
            else{
                multiplicateur = (float)numpank /15;
                Ifarine = farine * multiplicateur;
                Ioeufs = oeufs * multiplicateur;
                Ibeurre = beurre * multiplicateur;
                Ilait = lait * multiplicateur;
                Ilevure = levure * multiplicateur;
                Isucre = sucre * multiplicateur;
                Isel =sel * multiplicateur;
                System.out.println("ils vous faut:");
                System.out.println(Ifarine+"g de farine");
                System.out.println(Ioeufs+"oeufs");
                System.out.println(Ibeurre+"de beurre");
                System.out.println(Ilait+"de lait");
                System.out.println(Ilevure+"de levure");
                System.out.println(Isucre+" de sucre");
                System.out.println(Isel+"de sel");
            }
        }











    }
}
