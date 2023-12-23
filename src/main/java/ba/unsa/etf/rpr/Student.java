package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Student extends Osoba {
    private static ArrayList<Student> listaStudenata;
    private String ime;
    private String prezime;
    private String godinaStudija;
    private String brojIndexa;
    private Ocjena ocjena;

    public void setOcjena(Ocjena ocjena) {
        this.ocjena = ocjena;
    }

    public static ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public Ocjena getOcjena() {
        return ocjena;
    }

    Student(String i, String p, String gs, String bI) {
        this.ime = i;
        this.prezime = p;
        this.godinaStudija = gs;
        this.brojIndexa = bI;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }
}
