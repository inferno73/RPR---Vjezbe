package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Nastavnik extends Osoba{
    private static ArrayList<Nastavnik> listaNastavnika;

    private String ime;
    private String prezime;
    String titula;

    /*public static void setListaNastavnika(ArrayList<Nastavnik> listaNastavnika) {
        Nastavnik.listaNastavnika = listaNastavnika;
    }*/

    public static ArrayList<Nastavnik> getListaNastavnika() {
        return listaNastavnika;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getTitula() {
        return titula;
    }
}