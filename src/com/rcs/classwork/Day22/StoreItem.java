package com.rcs.classwork.Day22;

public abstract class StoreItem {
    protected double price;
    protected int quantity;

    StoreItem(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getFullPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int count) {
        this.quantity += count;
    }

    public void decreaseQuantity(int count) {
        this.quantity -= count;
    }

    abstract double getPrice(boolean isClient);
}