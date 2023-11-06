package com.company;

public enum Grad {
    SARAJEVO("033"),
    TUZLA("035"),
    ZENICA("032"),
    BRCKO("049");

    private String pozivniBroj;

    Grad(String pb) { pozivniBroj = pb;}
    public static Grad izPozivnog(String pozivni) {
        for(Grad g:Grad.values()) {
            if(g.getPozivniBroj().equals(pozivni)) return g;
        }
        return null;
    }

    public String getPozivniBroj() {
        return this.pozivniBroj;
    }
}
