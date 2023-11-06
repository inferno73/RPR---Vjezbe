package com.company;

import java.util.*;

public class Imenik {
    private Map<String, TelefonskiBroj> brojevi;

    public Imenik() {
        this.brojevi = new HashMap<String, TelefonskiBroj>();
    }
    public Map<String, TelefonskiBroj> getBrojevi() {return brojevi;}
    public void setBrojevi(Map<String,TelefonskiBroj> m) {
        brojevi = m;
    }
    public void dodaj(String ime, TelefonskiBroj br) { brojevi.put(ime,br);}
    public String dajBroj(String ime) {
        TelefonskiBroj br = this.brojevi.get(ime);
        if(br!=null) return br.ispisi();
        return null;
    }
    public String dajIme(TelefonskiBroj br) {
        for(Map.Entry<String, TelefonskiBroj> entry: this.brojevi.entrySet()) {
            if(entry.getValue().ispisi().equals(br.ispisi())) return entry.getKey();
        }
        return null;
    }
    public String naSlovo(char c) {
        StringBuilder sb = new StringBuilder();
        int cnt=1;
        for(Map.Entry<String, TelefonskiBroj> entry: this.brojevi.entrySet()) {
            if(entry.getKey().startsWith(String.valueOf(c))) {
                sb.append(cnt).append(". ").append(entry.getKey())
                        .append("- ").append(entry.getValue().ispisi())
                        .append("/n");
            }
            cnt++;
        }
        return sb.toString();
    }
    public Set<String> izGrada(Grad g) {
        Set<String> rez = new TreeSet<String>();
        for(Map.Entry<String, TelefonskiBroj> entry: brojevi.entrySet()) {
            if(jeLiIzGrada(entry.getValue(),g)) rez.add(entry.getKey());
        }
        return rez;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> rez = new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo(o2.ispisi());
            }
        });
        for(Map.Entry<String, TelefonskiBroj> entry: this.brojevi.entrySet()) {
            if(jeLiIzGrada(entry.getValue(),g)) rez.add(entry.getValue());
        }
        return rez;
    }
    private boolean jeLiIzGrada(TelefonskiBroj broj, Grad g) {
        if(broj instanceof FiksniBroj) return g.equals(((FiksniBroj) broj).getGrad());
        return false;
    }

    @Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        int cnt=1;
        for(Map.Entry<String, TelefonskiBroj> entry: this.brojevi.entrySet()) {
            sb.append(cnt).append(". ").append(entry.getKey())
                    .append("- ").append(entry.getValue().ispisi())
                    .append("/n");

            cnt++;
        }
        return sb.toString();
    }
}
