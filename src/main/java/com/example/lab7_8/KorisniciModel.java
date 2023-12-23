package com.example.lab7_8;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    public ObservableList<Korisnik> lista = FXCollections.observableArrayList();
    public SimpleObjectProperty trenutniKorisnik = new SimpleObjectProperty<>();

    public void napuni(ObservableList<Korisnik> lk) {
        //check todo
    }

    public ObservableList<Korisnik> getLista() {
        return lista;
    }

    public void setLista(ObservableList<Korisnik> lista) {
        this.lista = lista;
    }

    public Korisnik getTrenutniKorisnik() {
        return (Korisnik) trenutniKorisnik.get();
    }

    public SimpleObjectProperty trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Object trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void dodajKorisnika() {
        lista.add(new Korisnik());
    }
}
