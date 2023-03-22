package com.example.myconverter.model;

public class Temperature {

    private int celsius;
    private int fahrenheit;
    private int temparture;

    public Temperature(){

    }
    public Temperature(int celsius, int fahrenheit, int temparture) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.temparture = temparture;
    }

    public int getTemparture() {
        return temparture;
    }

    public void setTemparture(int temparture) {
        this.temparture = temparture;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
