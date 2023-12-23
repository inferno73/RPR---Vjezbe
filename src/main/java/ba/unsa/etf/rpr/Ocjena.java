package ba.unsa.etf.rpr;

public class Ocjena {

    int ocjena;
    Ocjena(int ocjena) {
        this.setOcjena(ocjena);
    }
    public void setOcjena(int ocjena) {
        if(ocjena>=0 && ocjena <=10)
        this.ocjena = ocjena;
        else throw new RuntimeException("Ocjena mora biti izmedju 0 i 10");
    }
}
