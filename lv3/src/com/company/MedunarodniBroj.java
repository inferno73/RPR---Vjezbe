package com.company;

import java.util.Objects;

/** @noinspection ALL*/
public class MedunarodniBroj {
    private String drzava;
    private String broj;

    //broj +387
    MedunarodniBroj(String drzava, String broj) {
        this.broj = broj;
        this.drzava = drzava;
    }

    //@Override
    public String ispisi() {
        if(drzava!=null && broj!=null) return drzava+broj;
        return null;
    }

    @Override
    public int hashCode() { return Objects.hash(drzava,broj);}

}
