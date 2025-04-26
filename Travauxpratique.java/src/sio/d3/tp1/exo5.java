package sio.d3.tp1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exo5 {
    public static void main(String[] args) {
        float valeur;
        float s;
        float m;
        s = 0;
        m = 0;
        List<Float> reel = new ArrayList<>();
        Scanner lec = new Scanner(System.in);
        for(int i = 0; i < 9; i++) {
            System.out.println("saisir un vos valeurs:");
            valeur = lec.nextFloat();
            reel.add(valeur);
            s = s + valeur;

        }
        m = s / 9;
        System.out.println(s);
        System.out.println(m);
    }
}

