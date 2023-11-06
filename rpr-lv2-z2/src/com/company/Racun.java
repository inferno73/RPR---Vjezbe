package com.company;

public class Racun {
    private long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;
    private double prekoracenje;

    Racun(long broj, Osoba osoba) {
        this.brojRacuna = broj;
        this.korisnikRacuna = osoba;
        odobrenjePrekoracenja = false;
    }
    private boolean provjeriOdobrenjePrekoracenja(double p) {
        return odobrenjePrekoracenja = !(prekoracenje>this.stanjeRacuna);
    }
    public boolean izvrsiUplatu(double u) {
        stanjeRacuna += u;
        return true;
    }
    public boolean izvrsiIsplatu (double i) {
        if(stanjeRacuna+prekoracenje < i) return false;
        stanjeRacuna -= i;
        return true;
    }
    public void odobriPrekoracenje(double iznos) {
        prekoracenje = iznos;
        odobrenjePrekoracenja = true;
    }
}
