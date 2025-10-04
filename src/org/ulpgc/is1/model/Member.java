package org.ulpgc.is1.model;
import java.time.LocalDate;

public class Member {
    public Contact contact;
    public LocalDate date; // fecha de alta

    public Member(Contact contact) {
        this.contact = contact;
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }
}
