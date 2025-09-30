package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    public Group[] groupList;
    public Contact[] contactList;

    public Agenda() {
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, String city, String street, int floor, int number) {
        Address newAddress = new Address(street, number, floor, city);
        Person newPerson = new Person(firstName, lastName, telephone, email, newAddress);
        contactList.add(newPerson);
    }

    public void addCompany(Company company) {
        contactList.add(company);
    }

    public void addGroup(String groupName) {
        Group group = new Group(groupName);
        groupList.add(group);
    }

    public Contact[] getContactList() {
        return contactList;
    }

    public Group[] getGroupList() {
        return groupList;
    }
}