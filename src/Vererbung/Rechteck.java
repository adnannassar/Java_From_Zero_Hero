package Vererbung;

public class Rechteck extends Form {
    private int länge, breite;

    public Rechteck(Punkt pPosition, double pRichtung, int länge, int breite) {
        super(pPosition, pRichtung);
        this.länge = länge;
        this.breite = breite;
    }

    public int getLänge() {
        return länge;
    }

    public void setLänge(int länge) {
        this.länge = länge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    @Override
    public double berechneFläche() {
        return this.breite * this.länge;
    }

    @Override
    public String printInfo(){
        return "Rechteck: " + super.printInfo()+ ", Fläche: "+ this.berechneFläche();
    }
}
