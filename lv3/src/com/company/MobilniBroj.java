package com.company;

import java.util.Objects;

/** @noinspection ALL*/
public class MobilniBroj extends TelefonskiBroj {
    private int mobMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
        this.broj = broj;
        mobMreza = mobilnaMreza;
    }

    @Override
    public String ispisi() {
        if(broj!=null) return "0" + mobMreza + "/" + broj;
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobMreza, broj);
    }
}
