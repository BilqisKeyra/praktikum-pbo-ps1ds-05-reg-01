package com.bilqis.guided02;

public class Invoice implements Payable {
    private String partName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partName, int quantity, double pricePerItem) {
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartName() {
        return partnName;
    }

    //Hitung tagihan 
    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

}
