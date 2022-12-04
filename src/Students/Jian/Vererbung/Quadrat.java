package Students.Jian.Vererbung;

public class Quadrat extends Rechteck{


    public Quadrat(Punkt pPosition, double pRichtung, int pA) {
        super(pPosition, pRichtung, pA, pA);
    }
    @Override
    public int getA(){
        return super.getA() ;
    }
    @Override
    public String printInfo(){
        return "Quadrat: " + super.printInfo().substring(10);
    }

}