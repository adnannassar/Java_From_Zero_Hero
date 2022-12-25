package Advanced.MedienVerwaltung.Alt;

import Advanced.MedienVerwaltung.Medium;

import java.util.Iterator;
import java.util.LinkedList;

public class MedienVerwaltungNichtTypsicher {
    private LinkedList medien;

    public MedienVerwaltungNichtTypsicher() {
        this.medien = new LinkedList();
    }

    public void aufnehmen(Medium m) {
        medien.add(m);
    }

    public void zeigeMedium() {
        Iterator it = medien.iterator();
        while (it.hasNext()) {
            Medium m = (Medium) it.next();
            m.druckeDaten();
        }
    }

    public void sucheNeuesMedium() {
        if (!medien.isEmpty()) {
            Medium neuesteMediumAlter = (Medium) medien.get(0);

            for (Object obj : medien) {
                Medium m = (Medium) obj;
                if (m.alter() < neuesteMediumAlter.alter()) {
                    neuesteMediumAlter = m;
                }
            }
            System.out.print("Das neuste Medium ist: ");
            neuesteMediumAlter.druckeDaten();
        }


    }

    public double berechneErscheinungJahr() {
        double summeJahren = 0.0;

        for (Object obj : medien) {
            Medium m = (Medium) obj;
            summeJahren += m.getJahr();
        }
        return summeJahren / medien.size();
    }
}
