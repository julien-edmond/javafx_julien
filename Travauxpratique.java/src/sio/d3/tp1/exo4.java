package sio.d3.tp1;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {

        String phrase;
        int cpt;
        cpt = 0;
        System.out.println("saisir un message:");
        Scanner lecteur=new Scanner(System.in).useDelimiter("\n");
        phrase = lecteur.next();
        for(int i=0; i < phrase.length();i++){
            char result = phrase.charAt(i);
            if(result == 'e' || result == 'E'){
                cpt = cpt + 1;
            }

        }
        System.out.println("il y a"+cpt+"lettre e dans le message"+phrase+"");


    }
}
