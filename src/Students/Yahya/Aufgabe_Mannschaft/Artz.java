package Students.Yahya.Aufgabe_Mannschaft;

public class Artz extends Mitglied{
    private String fach;

    public Artz (String name , String vorname , String fach){
        super(name , vorname);
        this.fach = fach;
    }

    @Override
    public double gehalt() {
        return 10000;
    }
}
