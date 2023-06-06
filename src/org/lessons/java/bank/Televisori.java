package org.lessons.java.bank;

public class Televisori extends Prodotto {

    private int screenSize;
    private boolean isSmart;

    public Televisori(String name, String description, double price, int taxes, int screenSize, boolean isSmart) {
        super(name, description, price, taxes);
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "Serie " + getName();
    }
}
