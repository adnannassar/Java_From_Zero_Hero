package Students.Jian.MitarbeiterVererbung;

public class Manager extends Mitarbeiter {
    private double festgehalt;
    private double provision;
    private double umsatz;

    public Manager(String name, double fgehalt,double provision) {
        super(name);
        this.festgehalt = fgehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }
    public void PrintInfoManager(){
        System.out.println("Manager: \nName: " + getName() + "\nPersonalnummer: " + getPersonalnummer() + "\nGehalt: " + this.berechneGehalt());
    }
    @Override
    public double berechneGehalt(){
        return festgehalt + provision + umsatz;
    }
}
