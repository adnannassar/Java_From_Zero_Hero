package Students.Jian.MannschaftVererbung;

public class Spieler extends Mitgelied{
    private String spielposition;
    private int spieleinsätzeProSaison;

    public Spieler(String name, String vorname, String spielposition, int spieleinsätzeProSaison) {
        super(name, vorname);
        this.spielposition = spielposition;
        this.spieleinsätzeProSaison = spieleinsätzeProSaison;
    }

    public String getSpielposition() {
        return spielposition;
    }

    public void setSpielposition(String spielposition) {
        this.spielposition = spielposition;
    }

    public int getSpieleinsätzeProSaison() {
        return spieleinsätzeProSaison;
    }

    public void setSpieleinsätzeProSaison(int spieleinsätzeProSaison) {
        this.spieleinsätzeProSaison = spieleinsätzeProSaison;
    }

    public double berechneJahresgehalt(){
        return 180000 + (getSpieleinsätzeProSaison() * 5000);
    }
}
