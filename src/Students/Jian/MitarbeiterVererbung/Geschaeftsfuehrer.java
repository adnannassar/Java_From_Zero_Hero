package Students.Jian.MitarbeiterVererbung;

public class Geschaeftsfuehrer extends Manager{
    private double zulage;

    public Geschaeftsfuehrer(String name, double fgehalt, double provision, double zulage) {
        super(name, fgehalt, provision);
        this.zulage = zulage;
    }
    public void PrintInfoGeschaeftsfuehrer(){
        System.out.println("Geschäftsführer: \nName: " + getName() + "\nPersonalnummer: " + getPersonalnummer() + "\nGehalt: " + this.berechneGehalt());
    }
    @Override
    public double berechneGehalt(){
        return super.berechneGehalt() + zulage;
    }
}
