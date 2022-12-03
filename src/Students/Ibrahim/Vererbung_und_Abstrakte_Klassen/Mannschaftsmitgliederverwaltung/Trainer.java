package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mannschaftsmitgliederverwaltung;

public class Trainer extends Mitglied{
    private Spieler liebliengsSpieler;

    public Trainer(String name, String vorname) {
        super(name, vorname);
    }

    public void setLiebliengsSpieler(Spieler liebliengsSpieler) {
        this.liebliengsSpieler = liebliengsSpieler;
    }

    @Override
    public double berechneJahresGehlat() {
        return 165000.0 * 12;
    }

    @Override
    public String getSonstiges() {
        return "Lieblingsspieler: " + liebliengsSpieler.getVorname() + " " + liebliengsSpieler.getName();
    }

    @Override
    public String toString() {
        return "Type: T\n" + super.toString() + "Lieblingsspieler: " + liebliengsSpieler.getVorname() + " " + liebliengsSpieler.getName() + "\n";
    }
}
