package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.Ocjena;

import java.util.ArrayList;

public class Predmet {
    private String naziv;
    private String opis;
    private ArrayList<Ocjena> listaOcjena;

    public ArrayList<Ocjena> getListaOcjena() {
        return listaOcjena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }
}
