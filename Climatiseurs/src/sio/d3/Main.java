package sio.d3;

public class Main {
    public static void main(String[] args) {

        Climatiseur c = new Climatiseur();

        c.setPuissance(900);

        System.out.println(c.getMarque());

        int diff = c.getSurface_max()- c.getSurface_min();

        System.out.println("diff = "+ diff);
    }
}