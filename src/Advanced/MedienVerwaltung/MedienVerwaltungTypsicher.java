package Advanced.MedienVerwaltung;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class MedienVerwaltungTypsicher {
    private LinkedList<Medium> medien;

    public MedienVerwaltungTypsicher() {
        this.medien = new LinkedList<>();
    }

    public void aufnehmen(Medium m) {
        medien.add(m);

    }

    public void zeigeMedium() {
        // ErscheinungJahrComparator eJc = new ErscheinungJahrComparator();
        /* medien.sort(new Comparator<Medium>() {
            @Override
            public int compare(Medium o1, Medium o2) {
                return o1.getJahr() - o2.getJahr();
            }
        });
        */
        /*
        Collections.sort(medien, new Comparator<Medium>() {
            @Override
            public int compare(Medium o1, Medium o2) {
                return o1.getJahr() - o2.getJahr();
            }
        });
         */

        Collections.sort(medien);
        Iterator<Medium> it = medien.iterator();
        while (it.hasNext()) {
            it.next().druckeDaten();
        }
    }

    public void sucheNeuesMedium() {
        if (!medien.isEmpty()) {
            Medium neuesteMediumAlter = medien.get(0);
            for (Medium m : medien) {
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

        for (Medium m : medien) {
            summeJahren += m.getJahr();
        }
        return summeJahren / medien.size();
    }
}
