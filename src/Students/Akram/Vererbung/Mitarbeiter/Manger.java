package Students.Akram.Vererbung.Mitarbeiter;


public class Manger extends Mitarbeiter {

    private Double festgehalt;
    private Double provision;
    private Double umsatz;


    public Manger(String name, Double festgehalt, Double provision) {
        super(name);
        this.festgehalt = festgehalt;
        this.provision = provision;
    }

    @Override
    public int getPersonalnummer() {
        return super.getPersonalnummer() +1;
    }

    public void setUmsatz(Double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public Double berechneGehalt() {
        return festgehalt + provision + umsatz;
    }
}
