package Advanced.MedienVerwaltung.Alt;

import Advanced.MedienVerwaltung.Audio;
import Advanced.MedienVerwaltung.Bild;

public class MainArray {
    public static void main(String[] args) {
        Bild bild = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");
        Audio audio = new Audio("It Means Nothing", 2007, "Stereophonics", 229);

        MedienVerwaltungArray medienVerwaltungArray = new MedienVerwaltungArray(5);

        medienVerwaltungArray.aufnehmen(bild);
        medienVerwaltungArray.aufnehmen(audio);

        medienVerwaltungArray.zeigeMedium();

        medienVerwaltungArray.sucheNeuesMedium();

        System.out.println("ErscheinungJahr: " + medienVerwaltungArray.berechneErscheinungJahr());

    }
}
