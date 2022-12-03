package Students.Yahya.Aufgabe_Mannschaft;

public abstract class Mitglied {
    private String name,vorname;

    public Mitglied(String name, String vorname){
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public abstract double gehalt();
}
