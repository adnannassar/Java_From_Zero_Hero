package Students.RawanAlMohammad.FußballSpiel;

public class Artze extends Mitglieder{
    private String fachrichtung;


    public Artze(String name, String vorname, String fachrichtung) {
        super(name, vorname);
        this.fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }


    @Override
    public String toString() {
        return String.valueOf(jahresgehlt() );
    }

    @Override
    public double jahresgehlt() {
        return  10000.0*12;
    }
}
