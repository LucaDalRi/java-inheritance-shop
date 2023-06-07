package org.lessons.java.bank;

import java.util.Random;

public class Prodotto {
    private String name;
    private String description;
    private double price;
    private int taxes;
    private int serialCode;

//    Constructor

    public Prodotto(String name, String description, double price, int taxes) {
        this.serialCode = getSerialCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxes = taxes;
    }

    public Prodotto(Prodotto prodotto) {
        this.serialCode = getSerialCode();
        this.name = prodotto.name;
        this.description = prodotto.description;
        this.price = prodotto.price;
        this.taxes = prodotto.taxes;
    }

    //    Methods
    public double taxedPrice() {
        double priceToAdd = (this.price * this.taxes) / 100;

        return this.price + priceToAdd;
    }

//    Getter Setter

    private int getSerialCode() {

        Random random = new Random();

        int tempSerial = random.nextInt((99999999 - 10000000) + 1) + 10000000;

        return tempSerial;

    }

    public String getFullName() {
        return this.name + "-" + this.serialCode;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getTaxes() {
        return this.taxes;
    }

    @Override
    public String toString() {
        return "Contenuto " + name;
    }
}
