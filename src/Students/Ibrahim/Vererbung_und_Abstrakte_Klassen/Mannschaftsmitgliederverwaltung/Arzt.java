package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mannschaftsmitgliederverwaltung;

public class Arzt extends Mitglied{
    private String fachrichtung;

    public Arzt(String name, String vorname, String fachrichtung) {
        super(name, vorname);
        this.fachrichtung = fachrichtung;
    }

    @Override
    public double berechneJahresGehlat() {
        return 10000.0 * 12;
    }

    @Override
    public String getSonstiges() {
        return "Fachrichtung: " + fachrichtung;
    }

    @Override
    public String toString() {
        return "Type: A\n" + super.toString() + "Fachrichtung: " + fachrichtung + "\n";
    }
}
