package com.company;

import java.util.Objects;

/** @noinspection Since15*/
public class FiksniBroj extends TelefonskiBroj {
    //public enum Grad {Sarajevo, Tuzla, Zenica, Brcko};
    private Grad grad;
    private String brojTelefona;

    FiksniBroj(Grad grad, String broj) {
        if(grad==null) throw new BrojException("Pozivni broj nije ok!");
        this.grad = grad;
        this.brojTelefona = broj;
    }
    @Override
    public String ispisi() {
        if(grad!=null && brojTelefona!=null) return grad.getPozivniBroj() + "/" + brojTelefona;
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad, brojTelefona); //supressed inspection
    }

    public Grad getGrad() {return grad;}
    public String getBrojTelefona() { return brojTelefona;}



}
