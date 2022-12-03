package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mitarbeiterverwaltung;

abstract public class Mitarbeiter {
    private String name;
    private int personalnummer;
    private static int anzahlMitarbeiter = 1;

    public Mitarbeiter(String name) {
        this.name = name;
        this.personalnummer = anzahlMitarbeiter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    @Override
    public String toString() {
        return this.name + " " + this.personalnummer + " ";
    }

    public abstract double berechneGehalt();

}
