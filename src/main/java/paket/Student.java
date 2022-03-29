package paket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private int brojIndeksa;
    private int godinaUpisa;
    private List<Integer> upisaneGodine = new ArrayList<>();
    private List<Predmet> polozeniPredmeti = new ArrayList<>();
    private OznakaPlana plan;

    public Student(int brojIndeksa, int godinaUpisa, OznakaPlana plan,int upisanaGodina) {
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.plan = plan;
        this.upisaneGodine.add(upisanaGodina);
    }

    public int vratiTrenutnuGodinuStudija(){
        Collections.sort(upisaneGodine);
        return upisaneGodine.get(upisaneGodine.size()-1);// poslednji element
    }

    public boolean jePonovac(){
        Collections.sort(upisaneGodine);
        if (upisaneGodine.size() == 1){
            return false; //ako je prva godina
        }

        if (upisaneGodine.get(upisaneGodine.size()-1).equals(upisaneGodine.get(upisaneGodine.size()-2))){
            return true;
        }
        return false;
    }

    public OznakaPlana getPlan() {
        return plan;
    }

    public List<Integer> getUpisaneGodine() {
        return upisaneGodine;
    }

    public void setUpisaneGodine(List<Integer> upisaneGodine) {
        this.upisaneGodine = upisaneGodine;
    }

    public List<Predmet> getPolozeniPredmeti() {
        return polozeniPredmeti;
    }

    public void setPolozeniPredmeti(List<Predmet> polozeniPredmeti) {
        this.polozeniPredmeti = polozeniPredmeti;
    }

}
