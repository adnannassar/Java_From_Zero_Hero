package Vererbung_und_Abstrakte_klassen;

public class Quadrat extends Rechteck {


    public Quadrat(Punkt pPosition, double pRichtung, int breite) {
        super(pPosition, pRichtung, breite, breite);
    }

    @Override
    public String printInfo() {
        return "Quadrat: " + super.printInfo().substring(10);
    }

}
