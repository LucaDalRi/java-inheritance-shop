package org.lessons.java.bank;

class Smartphone extends Prodotto {
    private int imeiCode;
    private int storageAmount;


    public Smartphone(String name, String description, double price, int taxes, int imeiCode, int storageAmount) {
        super(name, description, price, taxes);
        this.imeiCode = imeiCode;
        this.storageAmount = storageAmount;
    }

    public Smartphone(Prodotto prodotto, int imeiCode, int storageAmount) {
        super(prodotto);
        this.imeiCode = imeiCode;
        this.storageAmount = storageAmount;
    }

    public int getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(int imeiCode) {
        this.imeiCode = imeiCode;
    }

    public int getStorageAmount() {
        return this.storageAmount;
    }

    public void setStorageAmount(int storageAmount) {
        this.storageAmount = storageAmount;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imeiCode=" + imeiCode +
                ", storageAmount=" + storageAmount +
                '}';
    }
}

