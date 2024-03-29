package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.MathDreieckFlaeche;

public class Dreieck extends Form {

    private Punkt punktB, punktC;

    public Dreieck(Punkt pPosition, double pRichtung, Punkt pPunktB, Punkt pPunktC) {
        super(pPosition, pRichtung);
        this.punktB = pPunktB;
        this.punktC = pPunktC;
    }

    public Punkt getPunktB() {
        return punktB;
    }

    public void setPunktB(Punkt punktB) {
        this.punktB = punktB;
    }

    public Punkt getPunktC() {
        return punktC;
    }

    public void setPunktC(Punkt punktC) {
        this.punktC = punktC;
    }

    @Override
    public double berechneFläche() {
        double abX = getPunktB().getX() - getPosition().getX();
        double abY = getPunktB().getY() - getPosition().getY();

        double acX = getPunktC().getX() - getPosition().getX();
        double acY = getPunktC().getY() - getPosition().getY();

        double fläche = 0.5 * ((abX * acY) - (abY * acX));
        if (fläche < 0) return fläche * (-1);
        return fläche;
    }

    @Override
    public String printInfo(){
        return "Dreieck: " + super.printInfo()+ ", Fläche: "+ this.berechneFläche();
    }
}
