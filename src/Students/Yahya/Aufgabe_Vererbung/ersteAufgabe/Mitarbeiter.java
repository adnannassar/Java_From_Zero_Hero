package Students.Yahya.Aufgabe_Vererbung.ersteAufgabe;

public abstract class Mitarbeiter {

    private String name;
    private int personalnummer;
    private int anzahlMitarbeiiter;


    public Mitarbeiter(String name){
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

    public abstract double berechneGehalt();
}
