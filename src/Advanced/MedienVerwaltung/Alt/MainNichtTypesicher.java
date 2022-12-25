package Advanced.MedienVerwaltung.Alt;

import Advanced.MedienVerwaltung.Audio;
import Advanced.MedienVerwaltung.Bild;

public class MainNichtTypesicher {
    public static void main(String[] args) {
        Bild bild = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");
        Audio audio = new Audio("It Means Nothing", 2007, "Stereophonics", 229);

        MedienVerwaltungNichtTypsicher mv = new MedienVerwaltungNichtTypsicher();

        mv .aufnehmen(bild);
        mv .aufnehmen(audio);

        mv .zeigeMedium();

        mv .sucheNeuesMedium();

        System.out.println("ErscheinungJahr: " + mv .berechneErscheinungJahr());

    }
}
