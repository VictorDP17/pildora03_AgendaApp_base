package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public List<Contact> contacts = new ArrayList<>();
    public List<Group> groups = new ArrayList<>();

    public Agenda() {
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        Address newAddress = new Address(street, number, floor, city);
        Person newPerson = new Person(firstName, lastName, telephone, email, newAddress);
        for (Contact c : contacts) {  // Miramos cada contacto de la lista
            if (c instanceof Person) {  // Si es clase o subclase de cada contacto
                if (c.equals(newPerson)) {  // Usamos el metodo equals creado previamente en Contact
                    return;
                }
            }
        }
        contacts.add(newPerson);
    }

    public void addCompany(String name, String description, String telephone, String email, String street, int number, int floor, String city) {
        Address newAddress = new Address(street, number, floor, city);
        Company newCompany = new Company(name, description, telephone, email, newAddress);
        contacts.add(newCompany);
    }

    public void addGroup(String groupName) {
        Group group = new Group(groupName);
        groups.add(group);
    }

    public List<Contact> getContactList() {
        return contacts;
    }

    public List<Group> getGroupList() {
        return groups;
    }

    public int contactCount() {
        return contacts.size();
    }

    public void addContact2group(Contact contact) {
        contacts.add(contact);
    }
}