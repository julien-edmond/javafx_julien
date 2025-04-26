package sio.test;

public class Tempo2 {
    public void go2() {
        Climatiseur c = new Climatiseur();

        c.puissance = 1200;

        c.setMarque("Panasonic");

        int diff = c.getSurface_max() - c.getSurface_min();

        System.out.println("diff = " + diff);
    }
}


