package Students.Jian.MannschaftVererbung;

public class Arzt extends Mitgelied{
    private String Fachrichtung;

    public Arzt(String name, String vorname, String fachrichtung) {
        super(name, vorname);
        Fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return Fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        Fachrichtung = fachrichtung;
    }

    public double berechneJahresgehalt(){
        return 10000;
    }
}
