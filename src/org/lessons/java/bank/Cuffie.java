package org.lessons.java.bank;

public class Cuffie extends Prodotto {

    private String color;
    private boolean isWireless;

    public Cuffie(String name, String description, double price, int taxes, String color, boolean isWireless) {
        super(name, description, price, taxes);
        this.color = color;
        this.isWireless = isWireless;
    }

    public Cuffie(Prodotto prodotto, String color, boolean isWireless) {
        super(prodotto);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Serie " + getName();
    }
}
