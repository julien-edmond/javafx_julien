package sio.d3.devoir;
public class Devoir {
    class Animal{
        private String nom;
        private String espece;
        private int age;
        private boolean estAdopte;

        public Animal(String nom, String espece,int age, boolean adoption ){
            this.nom = nom;
            this.espece = espece;
            this.age = age;
            this.estAdopte = estAdopte;

        }
        public Animal(){
            this.estAdopte = false;
            this.nom = "";
            this.espece ="";
            this.age = 0;

        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getEspece() {
            return espece;
        }

        public void setEspece(String espece) {
            this.espece = espece;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isEstAdopte() {
            return estAdopte;
        }

        public void setEstAdopte(boolean estAdopte) {
            this.estAdopte = estAdopte;
        }
        public void afficherDetails(){
            System.out.println(this.nom);
            System.out.println(this.espece);
            System.out.println(this.age);
            System.out.println(this.estAdopte);
        }
        public boolean jeuneAnimal ( int age){
            if(age < 3){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
