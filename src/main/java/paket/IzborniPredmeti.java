package paket;

public class IzborniPredmeti extends Predmet implements IzboriStudenata{
    public IzborniPredmeti(String naziv, int semestar, int espb, OznakaPlana oznakaPlana) {
        super(naziv, semestar, espb, oznakaPlana);
    }

    public boolean mozeDaIzabere(Student student) {
        if (student.jePonovac() && !student.getPolozeniPredmeti().contains(this.getNaziv()) && student.getPlan().equals(this.getOznakaPlana()) && (student.vratiTrenutnuGodinuStudija()*2 == this.getSemestar() || student.vratiTrenutnuGodinuStudija()*2-1 == this.getSemestar())){
            for (Predmet predmet:this.getPreduslovi()){
                if (!student.getPolozeniPredmeti().contains(predmet)){
                    return false;
                }
            }

        }
        return true;
    }
}
