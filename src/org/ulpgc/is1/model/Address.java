package org.ulpgc.is1.model;

public class Address {
    public String street;
    public int number;
    public int floor;
    public String city;

    public Address(String street, int number, int floor, String city) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.city = city;
    }
}
