package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Group {
    public final String name;
    public Contact[] contactList;

    public Group(String name) {
        this.name = name;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContact(int i) {
        contactList.remove(i)
    }
}