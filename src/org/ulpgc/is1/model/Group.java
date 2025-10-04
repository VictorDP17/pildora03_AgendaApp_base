package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public final String name;
    public List<Member> members = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addContact(Contact contact) {
        members.add(new Member(contact));
    }

    public void removeContact(int i) {
        members.remove(i);
    }

    public int contactCount() {
        return members.size();
    }

    public Member getMember(int i) {
        return members.get(i);
    }
}