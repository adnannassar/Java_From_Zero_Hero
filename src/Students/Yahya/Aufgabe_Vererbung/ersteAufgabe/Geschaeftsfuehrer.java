package Students.Yahya.Aufgabe_Vererbung.ersteAufgabe;

public class Geschaeftsfuehrer extends Manger{
    private double zulage;

    public Geschaeftsfuehrer(String name, double fgehalt , double provision, double zulage){
        super(name, fgehalt, provision);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt();
    }
}
