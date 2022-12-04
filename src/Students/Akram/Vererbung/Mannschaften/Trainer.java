package Students.Akram.Vererbung.Mannschaften;

public class Trainer extends Mitglieder {
    private Spieler lieblingsSpieler;

    public Trainer(String vorName, String name, Spieler lieblingsSpieler) {
        super(vorName, name);
        this.lieblingsSpieler = lieblingsSpieler;
    }

    public Spieler getLieblingsSpieler() {
        return lieblingsSpieler;
    }

    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    @Override
    Double jahresGehalt() {
        return 165000.0;
    }
}
