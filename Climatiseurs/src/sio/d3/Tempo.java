package sio.d3;

public class Tempo {
    public void go() {
        Climatiseur c = new Climatiseur();

        c.puissance = 1200;

        c.setMarque("Panasonic");

        int diff = c.getSurface_max() - c.getSurface_min();

        System.out.println("diff = " + diff);
    }
}
