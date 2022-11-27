package Students.Yahya.Vererbung;

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
        double BC = Math.sqrt(Math.pow(punktB.getX() - punktC.getX(),2) + Math.pow(punktB.getY() - punktC.getY(),2));
        double AB = Math.sqrt(Math.pow(getPosition().getX() - punktB.getX(),2) + Math.pow(getPosition().getY() - punktB.getY(),2));
        double AC = Math.sqrt(Math.pow(getPosition().getX() - punktC.getX(),2) + Math.pow(getPosition().getY() - punktC.getY(),2));
        double volume = AB + BC + AC;
        volume /= 2;
        double Flasche = Math.sqrt(volume * (volume - AB) * (volume - BC) * (volume - AC) ) ;
        return Flasche;
    }

    @Override
    public String printInfo(){
        return "Dreieck: " + super.printInfo()+ ", Fläche: "+ this.berechneFläche();
    }
}
