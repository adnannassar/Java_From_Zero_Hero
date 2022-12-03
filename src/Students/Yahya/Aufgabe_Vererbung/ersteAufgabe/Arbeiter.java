package Students.Yahya.Aufgabe_Vererbung.ersteAufgabe;

public class Arbeiter extends Mitarbeiter {

    private double stundenlohn;
    private double anzahlStunden;
    private double ueberstundenzuschlag;
    private double anzahlUeberstunden;


    public Arbeiter (String name , double stdlohn, double anzahlStd, double uestzus){
        super(name);
        this.stundenlohn = stdlohn;
        this.anzahlStunden = anzahlStd;
        this.anzahlUeberstunden = uestzus;
    }

    public void setAnzahlUeberstunden(double anzUeStunden) {
        this.anzahlUeberstunden = anzUeStunden;
    }

    @Override
    public double berechneGehalt() {
        return 0;
    }
}
