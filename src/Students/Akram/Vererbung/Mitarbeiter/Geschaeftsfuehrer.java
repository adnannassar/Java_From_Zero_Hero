package Students.Akram.Vererbung.Mitarbeiter;

public class Geschaeftsfuehrer extends Manger {

    private Double zulage;

    public Geschaeftsfuehrer(String name, Double festgehalt, Double provision,Double zulage) {
        super(name, festgehalt, provision);
        this.zulage=zulage;
    }


    @Override
    public Double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
