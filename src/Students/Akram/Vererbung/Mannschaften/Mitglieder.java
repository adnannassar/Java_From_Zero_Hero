package Students.Akram.Vererbung.Mannschaften;

abstract class Mitglieder {
    private String vorName;
    private String name;

    public Mitglieder(String vorName, String name) {
        this.vorName = vorName;
        this.name = name;
    }


    abstract Double jahresGehalt();


    public String getVorName() {
        return vorName;
    }

    public String getName() {
        return name;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setName(String name) {
        this.name = name;
    }
}
