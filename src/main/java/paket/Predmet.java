package paket;

import java.util.ArrayList;
import java.util.List;

public class Predmet {

    private String naziv;
    private int semestar;
    private int espb;
    private List<Predmet> preduslovi = new ArrayList<>();
    private OznakaPlana oznakaPlana;

    public Predmet(String naziv, int semestar, int espb,OznakaPlana oznakaPlana) {
        this.naziv = naziv;
        this.semestar = semestar;
        this.espb = espb;
        this.oznakaPlana = oznakaPlana;
    }

    public int getSemestar() {
        return semestar;
    }

    public OznakaPlana getOznakaPlana() {
        return oznakaPlana;
    }

    public void dodajPreduslov(Predmet predmet){
        if (predmet.getOznakaPlana().equals(this.oznakaPlana) && predmet.getSemestar() < this.semestar){
            preduslovi.add(predmet);
        }
    }

    public String getNaziv() {
        return naziv;
    }

    public List<Predmet> getPreduslovi() {
        return preduslovi;
    }

    public int getEspb() {
        return espb;
    }
}
