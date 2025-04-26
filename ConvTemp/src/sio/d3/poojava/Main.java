package sio.d3.poojava;
public class Main {
    public static void main(String[] args) {

        Temperature temp1;
        temp1 = new Temperature();
        Temperature temp2 = new Temperature(23);
        temp1.CalculFah();
        temp2.CalculFah();

        System.out.println(temp1.getValeurCelsius()+"C equivaut à "+ temp1.getValeurFahrenheit()+ "F");
        System.out.println(temp2.getValeurCelsius()+"C equivaut à "+ temp1.getValeurFahrenheit()+ "F");
    }
}