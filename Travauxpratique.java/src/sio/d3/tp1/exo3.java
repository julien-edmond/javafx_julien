package sio.d3.tp1;

import java.util.Scanner;

public class exo3{
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        float salaire;
        float charge;
        float salaire_R;
        String continuer;
        System.out.println("saisir salaire:");
        salaire = lec.nextInt();

        while(true) {
            System.out.println("saisir montant de la charge:");
            charge = lec.nextInt();
            salaire = salaire - charge;
            System.out.println("voulez vous continuer:");
            continuer = lec.next();
            if( continuer.equals("non")){
                break;
            }



        }
        System.out.println("apres paiement il vous reste :"+ salaire );

    }
}
