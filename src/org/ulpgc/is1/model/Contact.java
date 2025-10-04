package org.ulpgc.is1.model;

import java.util.Objects;

public abstract class Contact {
    public String telephone;
    public String email;
    public Address address;

    public Contact(String telephone, String email, Address address) {
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public abstract String getName();

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;  // Si apuntan a la misma dirección de memoria
        if (other == null || getClass() != other.getClass()) return false;  // Si es null o no es de la misma clase
        Contact contact = (Contact) other;  // Cambiamos other a tipo Contact
        return Objects.equals(getName(), contact.getName());
    }
}