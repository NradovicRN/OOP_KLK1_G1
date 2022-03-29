package paket;

import java.util.ArrayList;
import java.util.List;

public class IzborniModul implements IzboriStudenata{

    private String naziv;
    private List<Predmet> predmetiModula = new ArrayList<>();
    private int espbMin;

    public boolean mozeDaIzabere(Student student) {
        if (student.vratiTrenutnuGodinuStudija() == 3 && !student.jePonovac()){
            int studentEspb = 0;
            for (Predmet predmet:student.getPolozeniPredmeti()){
                studentEspb +=predmet.getEspb();
            }
            if (studentEspb >= this.espbMin){
                return true;
            }
        }
        return false;
    }

    public IzborniModul(String naziv, List<Predmet> predmetiModula, int espbMin) {
        this.naziv = naziv;
        this.predmetiModula = predmetiModula;
        this.espbMin = espbMin;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Predmet> getPredmetiModula() {
        return predmetiModula;
    }

    public void setPredmetiModula(List<Predmet> predmetiModula) {
        this.predmetiModula = predmetiModula;
    }

    public int getEspbMin() {
        return espbMin;
    }

    public void setEspbMin(int espbMin) {
        this.espbMin = espbMin;
    }
}
