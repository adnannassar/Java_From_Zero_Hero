package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mitarbeiterverwaltung;

public class Manager extends Mitarbeiter{

    private double festgehalt;
    private double provision;
    private double umsatz;

    public Manager(String name, double festgehalt, double provision) {
        super(name);
        this.festgehalt = festgehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public String toString() {
        return super.toString() + this.berechneGehalt();
    }

    @Override
    public double berechneGehalt() {
        return festgehalt + provision + umsatz;
    }
}
