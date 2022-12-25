package Advanced.MedienVerwaltung;

public class MainTypsicher {
    public static void main(String[] args) {
        Bild bild = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");
        Audio audio = new Audio("It Means Nothing", 2007, "Stereophonics", 229);

        MedienVerwaltungTypsicher mv = new MedienVerwaltungTypsicher();

        mv.aufnehmen(bild);
        mv.aufnehmen(audio);

        mv.zeigeMedium();

        mv.sucheNeuesMedium();

        System.out.println("ErscheinungJahr: " + mv.berechneErscheinungJahr());

    }
}
