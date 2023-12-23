package com.example.lab7_8;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class Korisnik implements Serializable {
    private SimpleStringProperty imeK = new SimpleStringProperty("");
    private SimpleStringProperty prezimeK = new SimpleStringProperty("");
    private SimpleStringProperty emailK = new SimpleStringProperty("");
    private SimpleStringProperty lozinkaK = new SimpleStringProperty("");
    private SimpleStringProperty usernameK = new SimpleStringProperty("");

    public Korisnik() {}
    public Korisnik(String imeK, String prezimeK, String emailK, String lozinkaK, String usernameK) {
        this.imeK = new SimpleStringProperty(imeK);
        this.prezimeK = new SimpleStringProperty(prezimeK);
        this.emailK = new SimpleStringProperty(emailK);
        this.lozinkaK = new SimpleStringProperty(lozinkaK);
        this.usernameK = new SimpleStringProperty(usernameK);
    }

    public String getImeK() {
        return imeK.get();
    }

    public SimpleStringProperty imeKProperty() {
        return imeK;
    }

    public void setImeK(String imeK) {
        this.imeK.set(imeK);
    }

    public String getPrezimeK() {
        return prezimeK.get();
    }

    public SimpleStringProperty prezimeKProperty() {
        return prezimeK;
    }

    public void setPrezimeK(String prezimeK) {
        this.prezimeK.set(prezimeK);
    }

    public String getEmailK() {
        return emailK.get();
    }

    public SimpleStringProperty emailKProperty() {
        return emailK;
    }

    public void setEmailK(String emailK) {
        this.emailK.set(emailK);
    }

    public String getLozinkaK() {
        return lozinkaK.get();
    }

    public SimpleStringProperty lozinkaKProperty() {
        return lozinkaK;
    }

    public void setLozinkaK(String lozinkaK) {
        this.lozinkaK.set(lozinkaK);
    }

    public String getUsernameK() {
        return usernameK.get();
    }

    public SimpleStringProperty usernameKProperty() {
        return usernameK;
    }

    public void setUsernameK(String usernameK) {
        this.usernameK.set(usernameK);
    }

    @Override
    public String toString() {
        return getImeK() + " " + getPrezimeK();
    }
}
