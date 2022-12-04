package Students.Akram.Vererbung.Mannschaften;

public class Spieler extends  Mitglieder {

    private String spielPosition;
    private int spielAnsaetzeAnzahlProSaison;

    public Spieler(String vorName, String name, String spielPosition, int spielAnsaetzeAnzahlProSaison) {
        super(vorName, name);
        this.spielPosition = spielPosition;
        this.spielAnsaetzeAnzahlProSaison = spielAnsaetzeAnzahlProSaison;
    }

    public String getSpielPosition() {
        return spielPosition;
    }

    public int getSpielAnsaetzeAnzahlProSaison() {
        return spielAnsaetzeAnzahlProSaison;
    }

    public void setSpielPosition(String spielPosition) {
        this.spielPosition = spielPosition;
    }

    public void setSpielAnsaetzeAnzahlProSaison(int spielAnsaetzeAnzahlProSaison) {
        this.spielAnsaetzeAnzahlProSaison = spielAnsaetzeAnzahlProSaison;
    }

    @Override
    Double jahresGehalt() {
        return 180000.0 + (spielAnsaetzeAnzahlProSaison * 5000.0);
    }
}
