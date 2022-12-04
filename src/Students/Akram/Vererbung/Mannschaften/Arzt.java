package Students.Akram.Vererbung.Mannschaften;

public class Arzt extends Mitglieder {

    private String fachrichtung;


    public Arzt(String vorName, String name, String fachrichtung) {
        super(vorName, name);
        this.fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    @Override
    Double jahresGehalt() {
        return 10000.0;
    }
}
