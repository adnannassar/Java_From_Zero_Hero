package Students.Jian.MannschaftVererbung;

public abstract class Mitgelied {
    private String name, vorname;

    public Mitgelied(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public abstract double berechneJahresgehalt();

}
