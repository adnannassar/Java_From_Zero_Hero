package Students.Yahya.Aufgabe_Mannschaft;

public class Trainer extends Mitglied {
    private Spieler lieblingsSpieler;

    public Trainer(String name , String vorname , Spieler lieblingsSpieler){
        super(name,vorname);
        this.lieblingsSpieler = lieblingsSpieler;
    }

    @Override
    public double gehalt() {
        return 165000;
    }
}
