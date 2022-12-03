package Students.Yahya.Aufgabe_Vererbung.ersteAufgabe;

public class Manger extends Mitarbeiter{
    private double festgehalt;
    private double provision;
    private double umsatz;

    public Manger (String name,double fgehalt,double provision){
        super(name);
        this.festgehalt = fgehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public double berechneGehalt() {
        return festgehalt;
    }
}
