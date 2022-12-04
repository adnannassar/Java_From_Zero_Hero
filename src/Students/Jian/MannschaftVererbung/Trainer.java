package Students.Jian.MannschaftVererbung;

public class Trainer extends Mitgelied {
    private Spieler Lieblingsspieler;

    public Trainer(String name, String vorname, Spieler lieblingsspieler) {
        super(name, vorname);
        Lieblingsspieler = lieblingsspieler;
    }

    public Spieler getLieblingsspieler() {
        return Lieblingsspieler;
    }

    public void setLieblingsspieler(Spieler lieblingsspieler) {
        Lieblingsspieler = lieblingsspieler;
    }

    public double berechneJahresgehalt(){
        return 165000;
    }
}
