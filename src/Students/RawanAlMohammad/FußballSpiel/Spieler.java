package Students.RawanAlMohammad.FußballSpiel;

public class Spieler extends Mitglieder {
    private String spielPosition;
    private int AnzahlSpieleinsate;


    public Spieler(String name, String vorname, String spielPosition, int anzahlSpieleinsate) {
        super(name, vorname);
        this.spielPosition = spielPosition;
        AnzahlSpieleinsate = anzahlSpieleinsate;
    }

    public String getSpielPosition() {
        return spielPosition;
    }

    public void setSpielPosition(String spielPosition) {
        this.spielPosition = spielPosition;
    }

    public int getAnzahlSpieleinsate() {
        return AnzahlSpieleinsate;
    }

    public void setAnzahlSpieleinsate(int anzahlSpieleinsate) {
        AnzahlSpieleinsate = anzahlSpieleinsate;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "spielPosition='" + spielPosition + '\'' +
                ", AnzahlSpieleinsate=" + AnzahlSpieleinsate +
                '}';
    }

    @Override
    public double jahresgehlt() {
        return 180000.0 * 12 + ( AnzahlSpieleinsate * 5000.0);
    }
}
