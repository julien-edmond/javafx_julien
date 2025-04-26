package sio.d3.tp2;

import java.util.Scanner;

public class Item {
    public static void main(String[] args) {
        System.out.println("julien");
        Scanner lec = new Scanner(System.in);
        int a;
        int b;
        float c;
        System.out.println("Saisir la valeur de a :");
        a = lec.nextInt();
        System.out.println("Saisir la valeur de b :");
        b = lec.nextInt();
        if(a < b && b == 0){
            System.out.println("a droit etre supérieur à b et b doit etre différent de 0");

        }

        else{
            c=(float)a/b;
            System.out.println(a+"/"+b +"="+ c);
        }


    }
}

