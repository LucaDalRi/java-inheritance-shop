package org.lessons.java.bank;

public class Televisori extends Prodotto {

    private int screenSize;
    private boolean isSmart;

    public Televisori(String name, String description, double price, int taxes, int screenSize, boolean isSmart) {
        super(name, description, price, taxes);
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    public Televisori(Prodotto prodotto, int screenSize, boolean isSmart) {
        super(prodotto);
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return "Televisori{" +
                "screenSize=" + screenSize +
                ", isSmart=" + isSmart +
                '}';
    }
}
