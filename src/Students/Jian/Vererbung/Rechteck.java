package Students.Jian.Vererbung;

public class Rechteck extends Form{
    private int a;
    private int b;

    public Rechteck(Punkt pPosition, double pRichtung, int pA, int pB) {
        super(pPosition, pRichtung);
        this.a = pA;
        this.b = pB;
    }

    public double berechnenFläche(){
        return this.a * this.b;
    }
    @Override
    public String printInfo(){
        return "Rechteck: " + super.printInfo() + ", Fläche: " + this.berechnenFläche();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}