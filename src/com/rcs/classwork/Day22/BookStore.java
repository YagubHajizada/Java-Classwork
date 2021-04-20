package com.rcs.classwork.Day22;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private Address address;
    private String contactNumber;
    private List<StoreItem> storeItems;

    public BookStore(Address address, String contactNumber) {
        this.address = address;
        this.contactNumber = contactNumber;
        this.storeItems = new ArrayList<>();
    }

    public BookStore(Address address, String contactNumber, List<StoreItem> storeItems) {
        this.address = address;
        this.contactNumber = contactNumber;
        this.storeItems = storeItems;
    }

    public List<StoreItem> getStoreItems() {
        return storeItems;
    }

    public void addStoreItem(StoreItem item) {
        storeItems.add(item);
    }

    private String itemsToString() {
        String value = "";
        for(StoreItem item : storeItems) {
            value += item.toString() + "\n";
        }
        return value;
    }

    @Override
    public String toString() {
        return String.format("Address: %s\nContact nr.: %s\nStore items:\n%s",
                address.toString(), contactNumber, itemsToString());
    }
}