package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mitarbeiterverwaltung;

public class Geschaeftsfuehrer extends Manager{
    private double zulage;

    public Geschaeftsfuehrer(String name, double fgehlat, double provision, double zulage) {
        super(name, fgehlat, provision);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
