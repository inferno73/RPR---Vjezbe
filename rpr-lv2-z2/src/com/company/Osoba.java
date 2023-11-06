package com.company;

public class Osoba {
    private String ime, prezime;
    Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    @Override
    public String toString() {
        return "Ime: " + this.ime + ", prezime: " + this.prezime;
    }
}
