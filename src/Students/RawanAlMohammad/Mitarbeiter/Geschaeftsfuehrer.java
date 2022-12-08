package Students.RawanAlMohammad.Mitarbeiter;

public class Geschaeftsfuehrer extends Manager {
    private double zulage;


    public Geschaeftsfuehrer (String name, double fgehalt, double provision , double zulage){
        super(name,fgehalt,provision);
        this.zulage = zulage;
    }

    @Override
    public String toString() {
        return "Geschaeftsfuehrer{" + "Name="+ getName()+", "+
                 "Personalnummer= "+getPersonalnummer()+", "+
                "Gehalt=" + berechneGehalt()+
                '}';
    }

    @Override
    public  double berechneGehalt() {
        return super.berechneGehalt()+zulage;
    }
}
