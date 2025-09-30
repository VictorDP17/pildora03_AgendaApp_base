package org.ulpgc.is1.model;

public class Person extends Contact {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName, String telephone, String email, Address address) {
        super(telephone, email, address);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override public String getName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
