package Students.Yahya.Aufgabe_Mannschaft;

public class Spieler extends Mitglied{
    private String postition;
    private int anzahleinsätze;

    public Spieler (String name , String vorname , String postition , int anzahleinsätze){
        super(name , vorname);
        this.postition = postition;
        this.anzahleinsätze = anzahleinsätze;
    }

    @Override
    public double gehalt() {
        double gehalt = 18000 + 5000 * anzahleinsätze;
        return gehalt;
    }
}
