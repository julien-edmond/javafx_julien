package sio.d3.tp1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exo6{
    public static void main(String[] args) {
        float valeur;
        float mult;
        List<Float> reel = new ArrayList<>();
        List<Float> save = new ArrayList<>();
        Scanner lec = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("saisir un vos valeurs:");
            valeur = lec.nextFloat();
            mult = valeur * 2;
            reel.add(valeur);

            save.add(mult);


        }
        System.out.println(reel);
        System.out.println(save);
    }
}
