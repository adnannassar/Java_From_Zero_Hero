package Advanced.MedienVerwaltung;

import java.util.Comparator;

public class ErscheinungJahrComparator implements Comparator<Medium> {
    @Override
    public int compare(Medium o1, Medium o2) {
        return o1.getJahr() - o2.getJahr();
    }
}
