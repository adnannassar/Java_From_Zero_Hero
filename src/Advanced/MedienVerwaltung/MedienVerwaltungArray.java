package Advanced.MedienVerwaltung;

public class MedienVerwaltungArray {
    private Medium[] medien;

    public MedienVerwaltungArray(int size) {
        this.medien = new Medium[size];
    }

    public void aufnehmen(Medium m) {
        for (int i = 0; i < medien.length; i++) {
            if (medien[i] == null) {
                medien[i] = m;
                return;
            }
        }
        System.out.println("Medien Array ist voll!");
    }

    public void zeigeMedium() {
        for (int i = 0; i < medien.length; i++) {
            if (medien[i] != null) {
                medien[i].druckeDaten();
            }
        }
    }

    public void sucheNeuesMedium() {
        if (medien[0] != null) {
            Medium neuesteMediumAlter = medien[0];
            for (int i = 0; i < medien.length; i++) {
                if (medien[i] != null && (medien[i].alter() < neuesteMediumAlter.alter())) {
                    neuesteMediumAlter = medien[i];
                }
            }
            System.out.print("Das neuste Medium ist: ");
            neuesteMediumAlter.druckeDaten();
        }
    }

    public double berechneErscheinungJahr() {
        double summeJahren = 0.0;
        int anzahlMedien = 0;
        for (int i = 0; i < medien.length; i++) {
            if (medien[i] != null) {
                summeJahren += medien[i].getJahr();
                anzahlMedien++;
            }

        }
        return summeJahren / anzahlMedien;
    }
}
