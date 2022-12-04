package Students.Akram.Vererbung.Mitarbeiter;

 abstract class Mitarbeiter {
    private String name;
    private int personalnummer;
    private static int anzahlMitarbeiter = 0 ;

    public Mitarbeiter(String name) {
        personalnummer=anzahlMitarbeiter;
        anzahlMitarbeiter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalnummer() {
        return this.personalnummer;
    }

  public abstract Double berechneGehalt();
}
