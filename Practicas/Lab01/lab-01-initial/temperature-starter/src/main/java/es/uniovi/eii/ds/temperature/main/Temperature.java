package es.uniovi.eii.ds.temperature.main;

public class Temperature {



    private double celsius;
    private double fahrenheit;


    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = celsius * 9 / 5 + 32;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius=  (fahrenheit + 32) * 5 / 9 ;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
