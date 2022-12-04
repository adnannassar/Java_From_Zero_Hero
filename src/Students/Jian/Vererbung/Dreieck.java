package Students.Jian.Vererbung;

public class Dreieck extends Form {

    private Punkt punktB;
    private Punkt punktC;
    private double fläche;

    public Dreieck(Punkt pPosition, double pRichtung, Punkt pPunktB, Punkt pPunktC){
        super(pPosition, pRichtung);
        this.punktB = pPunktB;
        this.punktC = pPunktC;

    }

    @Override
    public double berechnenFläche(){
        fläche = 0.5 * (((getPosition().getX() - punktC.getX()) * (punktB.getY() - punktC.getY())) - ((getPosition().getY() - punktC.getY()) * (punktB.getX() - punktC.getY())));
        if (fläche < 0){
            return fläche * (-1);
        }else {
            return fläche;
        }
    }
    public Punkt getPunktB() {
        return punktB;
    }


    public Punkt getPunktC() {
        return punktC;
    }
    public void setPunktB(Punkt pPunktB){
        this.punktB = pPunktB;
    }
    public void setPunktC(Punkt pPunktC){
        this.punktC = pPunktC;
    }

    @Override
    public String printInfo(){
        return "Dreieck: " + super.printInfo() + ", Fläche: " + this.berechnenFläche();
    }


}
