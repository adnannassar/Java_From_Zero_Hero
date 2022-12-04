package Students.Jian.MitarbeiterVererbung;

public abstract class Mitarbeiter {
    private String name;
    private int personalnummer;
    private int anzahlMitarbeiter ;

    public Mitarbeiter(String name) {
        this.name = name;
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

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public abstract double berechneGehalt();
}
