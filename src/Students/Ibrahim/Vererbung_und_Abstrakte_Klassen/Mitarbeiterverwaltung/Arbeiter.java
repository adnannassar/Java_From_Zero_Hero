package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mitarbeiterverwaltung;

public class Arbeiter extends Mitarbeiter{

    private double stundenlohn;
    private double anzahlStuden;
    private double ueberstundenzuschlag;
    private double anzahlUeberstunden;

    public Arbeiter(String name, double stdlohn, double anzahlStd, double uestzus) {
        super(name);
        stundenlohn = stdlohn;
        anzahlStuden = anzahlStd;
        ueberstundenzuschlag = uestzus;
    }

    public void setAnzahlUeberstunden(double anzUeStunden) {
        anzahlUeberstunden = anzUeStunden;
    }
    @Override
    public double berechneGehalt() {
        return ((stundenlohn + anzahlUeberstunden) * anzahlStuden) + ueberstundenzuschlag;
    }
}
