package Students.RawanAlMohammad.Mitarbeiter;

public class Manager extends Mitarbeiter {
    private double festgehalt;
    private double provision;
    private double umsatz;

   public Manager(String name, double fgehalt,double provision){
       super(name);
       this.festgehalt = fgehalt;
       this.provision = provision;
   }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public String toString() {
        return "Manager{" +"Name ="+ getName()+", "+
                "Personalnummer="+ getPersonalnummer()+", "+
                "Gehalt=" + berechneGehalt()+
                '}';
    }

    @Override
    public double berechneGehalt() {
       return festgehalt+provision+umsatz;
    }
}
