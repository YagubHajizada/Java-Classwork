package com.rcs.classwork.Day22;

public final class NotebookItem extends StoreItem {
    private int pageCount;
    private String format;
    private NotebookType type;

    NotebookItem(double price, int quantity, int pageCount, String format,
                 NotebookType type) {
        super(price, quantity);
        this.pageCount = pageCount;
        this.format = format;
        this.type = type;
    }

    @Override
    double getPrice(boolean isClient) {
        return this.price * (isClient ? 0.6 : 1.0);
    }

    @Override
    public String toString() {
        return String.format("Notebook.\nPage count: %d\nFormat: %s\nType: %s\n" +
                "Price: %.2f\nQuantity: %d\n", pageCount, format, type, price, quantity);
    }
}
