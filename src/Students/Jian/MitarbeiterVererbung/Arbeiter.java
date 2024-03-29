package Students.Jian.MitarbeiterVererbung;

public class Arbeiter extends Mitarbeiter implements Mensch {
    private double stundenlohn;
    private double anzahlStunden;
    private double ueberstundenzuschlag;
    private double anzahlUeberstunden;

    public Arbeiter(String name, double stdlohn, double anzahlStd, double uestzus) {
        super(name);
        this.stundenlohn = stdlohn;
        this.anzahlStunden = anzahlStd;
        this.ueberstundenzuschlag = uestzus;
    }

    public void setAnzahlUeberstunden(double anzahlUeberstunden) {
        this.anzahlUeberstunden = anzahlUeberstunden;
    }
    @Override
    public double berechneGehalt(){
        return 0;
    }

    @Override
    public int age() {
        return 30;
    }

    @Override
    public double height() {
        return 180;
    }
}
