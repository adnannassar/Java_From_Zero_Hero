package Students.Ibrahim.Dozent;


public class Dozent {
    private String name;
    private String lehrgebiet;
    private boolean dekan = false;
    private char geschlecht;

    public Dozent(String name, String lehrgebiet, char geschlecht){
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }

    public void setDekan(boolean dekan) {
        this.dekan = dekan;
    }

    public void setGeschlecht (char geschlecht) {
        this.geschlecht = geschlecht;
    }
    public String getName (){
        return name;
    }

    public String getLehrgebiet() {
        return lehrgebiet;
    }

    public boolean isDekan() {
        return dekan;
    }

    public char getGeschlecht () {
        return geschlecht;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Lehrgebiet: " + lehrgebiet + ", Geschlecht: " + geschlecht;
    }
}

