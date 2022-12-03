package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mitarbeiterverwaltung;

public class Angestellter extends Mitarbeiter{

    private double grundgehalt;
    private double ortszuschlag;
    private double zulage;

    public Angestellter(String name, double gGehalt, double ortszus, double zulage) {
        super(name);
        grundgehalt = gGehalt;
        ortszuschlag = ortszus;
        this.zulage = zulage;
    }
    @Override
    public double berechneGehalt() {
        return grundgehalt + ortszuschlag + zulage;
    }
}
