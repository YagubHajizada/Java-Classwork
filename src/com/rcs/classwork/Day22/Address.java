package com.rcs.classwork.Day22;

public class Address {
    private String country;
    private String city;
    private String street;
    private int houseNr;

    public Address(String country, String city, String street, int houseNr) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNr = houseNr;
    }

        @Override
        public String toString() {
            return String.format("%s, %s, %s %d", country, city, street, houseNr);
    }
}