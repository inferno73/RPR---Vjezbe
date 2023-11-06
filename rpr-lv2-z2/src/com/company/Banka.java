package com.company;

import java.util.List;
import java.util.Random;

public class Banka {
    long brojRacuna;
    List<Korisnik> korisnici;
    List<Uposlenik> uposlenici;
    Banka() {}
    Korisnik kreirajNovogKorisnika(String i, String p) {
        Korisnik k = new Korisnik(i,p);
        korisnici.add(k);
        return k;
    }
    Uposlenik kreirajNovogUposlenika(String i, String p) {
        Uposlenik u = new Uposlenik(i,p);
        uposlenici.add(u);
        return u;
    }
    Racun kreirajRacunZaKorisnika(Korisnik korisnik) {
        Racun racun = null;
        for(Korisnik k : korisnici) {
            if (k == korisnik) {
                brojRacuna = (new Random().nextLong());
                racun = new Racun(brojRacuna,k);
                break;
            }
        }
        korisnik.dodajRacun(racun);
        return racun;
    }
}
