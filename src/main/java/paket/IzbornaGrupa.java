package paket;

import java.util.ArrayList;
import java.util.List;

public class IzbornaGrupa implements IzboriStudenata {
    private String oznaka;
    private OznakaPlana plan;
    private List<IzborniPredmeti> predmeti = new ArrayList<>();

    public boolean mozeDaIzabere(Student student) {
        return false;
    }

    public IzbornaGrupa() {

    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public OznakaPlana getPlan() {
        return plan;
    }

    public void setPlan(OznakaPlana plan) {
        this.plan = plan;
    }

    public List<IzborniPredmeti> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<IzborniPredmeti> predmeti) {
        this.predmeti = predmeti;
    }

    public boolean dodajPredmet(IzborniPredmeti predmet){
        return false;
    }
}
