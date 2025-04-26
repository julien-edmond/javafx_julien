package sio.d3.poojava;

public class Temperature {

    private float valeurCelsius;
    private float valeurFahrenheit;
    public Temperature(){
        this.valeurCelsius = 0;
    }
    public Temperature(float vc){
        this.valeurCelsius = vc;
    }

    public float getValeurFahrenheit() {
        return valeurFahrenheit;
    }

    public void setValeurFahrenheit(float valeurFahrenheit) {
        this.valeurFahrenheit = valeurFahrenheit;
    }

    public float getValeurCelsius() {
        return valeurCelsius;
    }

    public void setValeurCelsius(float valeurCelsius) {
        this.valeurCelsius = valeurCelsius;
    }
    public void CalculFah(){
        this.valeurFahrenheit = (float) (this.valeurCelsius * 1.8 + 32);
    }
    public void CalculDeg(){
        this.valeurCelsius = (float)  ((this.valeurFahrenheit - 32) / 1.8);
    }

}
