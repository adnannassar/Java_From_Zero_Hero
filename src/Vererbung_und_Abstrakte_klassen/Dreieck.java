package Vererbung_und_Abstrakte_klassen;

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
        return 15;
    }

    @Override
    public String printInfo(){
        return "Dreieck: " + super.printInfo()+ ", Fläche: "+ this.berechneFläche();
    }
}
