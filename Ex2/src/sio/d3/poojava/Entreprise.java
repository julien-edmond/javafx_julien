package sio.d3.poojava;

public class Entreprise {
    private int nbS;
    private float Pourcentage1;
    private float Pourcentage2;
    private float Pourcentage3;;
    private int nbS1;
    private int nbS2;
    private int nbS3;

    public Entreprise(int nbS) {
        this.nbS = nbS;
    }

    public Entreprise(int nbS, float pourcentage1, float pourcentage2, float pourcentage3) {
        this.nbS = nbS;
        Pourcentage1 = pourcentage1;
        Pourcentage2 = pourcentage2;
        Pourcentage3 = pourcentage3;
    }

    public int getNbS() {
        return nbS;
    }

    public void setNbS(int nbS) {
        this.nbS = nbS;
    }

    public float getPourcentage1() {
        return Pourcentage1;
    }

    public void setPourcentage1(float pourcentage1) {
        Pourcentage1 = pourcentage1;
    }

    public float getPourcentage2() {
        return Pourcentage2;
    }

    public void setPourcentage2(float pourcentage2) {
        Pourcentage2 = pourcentage2;
    }

    public float getPourcentage3() {
        return Pourcentage3;
    }

    public void setPourcentage3(float pourcentage3) {
        Pourcentage3 = pourcentage3;
    }

    public int getNbS1() {
        return nbS1;
    }

    public void setNbS1(int nbS1) {
        this.nbS1 = nbS1;
    }

    public int getNbS2() {
        return nbS2;
    }

    public void setNbS2(int nbS2) {
        this.nbS2 = nbS2;
    }

    public int getNbS3() {
        return nbS3;
    }

    public void setNbS3(int nbS3) {
        this.nbS3 = nbS3;
    }
    public void calculer() {

        this.nbS1 = (int) ((this.Pourcentage1 / 100) * this.nbS);
        this.nbS2 = (int) ((this.Pourcentage2 / 100) * this.nbS);
        this.nbS3 = (int) ((this.Pourcentage3 / 100) * this.nbS);
    }
    public void affiche(){
        System.out.println(this.nbS);
        System.out.println(this.Pourcentage1);
        System.out.println(this.Pourcentage2);
        System.out.println(this.Pourcentage3);
        System.out.println(this.nbS1);
        System.out.println(this.nbS2);
        System.out.println(this.nbS3);

    }

}
