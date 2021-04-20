package com.rcs.classwork.Day22;

public class BookItem extends StoreItem{
    private Book item;

    public BookItem(double price, int quantity, Book item) {
        super(price, quantity);
        this.item = item;
    }

    public Book getItem() {
        return item;
    }


    @Override
    double getPrice(boolean isClient) {

        return this.price * (isClient ? 0.80 : 1.0);
    }

    @Override
    public String toString() {
        return String.format("%s\nPrice: %.2f\nQuantity: %d\n",
                item.toString(), price, quantity);
    }
}
