package paket;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Predmet p1 = new Predmet("LAAG",2,8,OznakaPlana.RN);
        Predmet p2 = new Predmet("MA",1,6,OznakaPlana.RN);
        Predmet p3 = new Predmet("OOP",2,10,OznakaPlana.RN);

        Predmet iz1 = new IzborniPredmeti("Poslovne aplikacije",3,4,OznakaPlana.RN);
        Predmet iz2 = new IzborniPredmeti("Dizajn aplikacija",4,10,OznakaPlana.RN);
        Predmet iz3 = new IzborniPredmeti("ORS",5,10,OznakaPlana.RN);

        iz1.dodajPreduslov(p1);
        iz1.dodajPreduslov(p2);
        iz2.dodajPreduslov(p2);
        iz3.dodajPreduslov(p1);

        IzbornaGrupa g1 = new IzbornaGrupa();
        IzbornaGrupa g2 = new IzbornaGrupa();

        g1.setOznaka("301 3. Godina");
        g2.setOznaka("302 3 Godina");

        Student s1 = new Student(49,21,OznakaPlana.RN,3);
        Student s2 = new Student(30,2019,OznakaPlana.RN,3);
        List<Integer> godine = new ArrayList<>();
        godine.add(3);
        godine.add(2);
        godine.add(1);
        godine.add(3);
        s2.setUpisaneGodine(godine);
        s2.jePonovac();
        List<Predmet> polozeni =new ArrayList<Predmet>();
        polozeni.add(p1);
        polozeni.add(p2);
        s1.setPolozeniPredmeti(polozeni);
        System.out.println(((IzborniPredmeti)iz1).mozeDaIzabere(s1));

    }
}
