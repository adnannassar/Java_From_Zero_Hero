package Students.Akram.Dozent;


public class Dozent {
    private String name;
    private String lehrgebiet;
    private boolean dekan = false;
    private char gechlecht;

    public Dozent (String name, String lehrgebiet, char gechlecht){
        this.name=name;
        this.lehrgebiet=lehrgebiet;
        this.gechlecht=gechlecht;
    }
    public String getName() {
        return name;
    }

    public String getLehrgebiet() {
        return lehrgebiet;
    }

    public boolean isDekan() {
        return dekan;
    }

    public char getGechlecht() {
        return gechlecht;
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

    public void setGechlecht(char gechlecht) {
        this.gechlecht = gechlecht;
    }





}
