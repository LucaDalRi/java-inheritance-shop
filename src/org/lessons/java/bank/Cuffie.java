package org.lessons.java.bank;

public class Cuffie extends Prodotto {

    private String color;
    private boolean isWireless;

    public Cuffie(String name, String description, double price, int taxes, String color, boolean isWireless) {
        super(name, description, price, taxes);
        this.color = color;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "Serie " + getName();
    }
}
