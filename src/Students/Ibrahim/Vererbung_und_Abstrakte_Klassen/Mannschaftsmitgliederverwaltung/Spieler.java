package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mannschaftsmitgliederverwaltung;

public class Spieler extends Mitglied {
    private String spielposition;
    private int anzahlDerSpielansätzeProSaison;
    public Spieler(String name, String vorname, String spielposition, int anzahlDerSpielansätzeProSaison) {
        super(name, vorname);
        this.spielposition = spielposition;
        this.anzahlDerSpielansätzeProSaison = anzahlDerSpielansätzeProSaison;
    }

    @Override
    public double berechneJahresGehlat() {
        return 180000.0 * 12 + (anzahlDerSpielansätzeProSaison * 5000.0);
    }

    @Override
    public String getSonstiges() {
        return "Position: " + spielposition + " / Spielansätze: " + anzahlDerSpielansätzeProSaison;
    }

    @Override
    public String toString() {
        return "Type: S\n" + super.toString() + "Position: " + spielposition + " / Spielsätze: " + anzahlDerSpielansätzeProSaison + "\n";
    }
}
