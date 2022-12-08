package Students.RawanAlMohammad.Mitarbeiter;

public class Arbeiter extends Mitarbeiter {
    private double stundenlohn;
    private double anzahlStunden;
    private double ueberstundenzuschlag;
    private double anzahlUberstunden;

    public Arbeiter(String name, double stdlohn, double anzahlStd, double uestzus) {
        super(name);
        this.stundenlohn = stdlohn;
        this.anzahlStunden = anzahlStd;
        this.anzahlUberstunden = uestzus;
    }

    public void setAnzahlUberstunden(double anzahlUberstunden) {
        this.anzahlUberstunden = anzahlUberstunden;
    }

    @Override
    public double berechneGehalt() {
        return  0;
    }
}
