package com.company;

public class Korisnik extends Osoba {
    protected Racun racun;
    Korisnik(String ime, String prezime) {
        super(ime, prezime);
    }
    void dodajRacun(Racun r) {
        this.racun = r;
    }
}
