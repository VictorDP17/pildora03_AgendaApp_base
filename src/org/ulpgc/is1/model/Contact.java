package org.ulpgc.is1.model;

public abstract class Contact {
    public String telephone;
    public String email;
    public Address address;

    public Contact(String telephone, String email, Address address) {
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public void getName() {
    }
}