package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mannschaftsmitgliederverwaltung;

abstract public class Mitglied {
    private String name;
    private String vorname;

    private int id;

    private static int counter = 1;

    public Mitglied(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public abstract double berechneJahresGehlat();
    public abstract String getSonstiges();

    @Override
    public String toString() {
        return "ID: " + id + "\n" +"Name: " + name + "\n" + "Vorname: " + vorname + "\n";
    }

    public char getType(Mitglied mitglied) {
        if (mitglied instanceof Spieler) return 'S';
        if (mitglied instanceof Trainer) return 'T';
        if (mitglied instanceof Arzt) return 'A';
        return ' ';
    }
}
