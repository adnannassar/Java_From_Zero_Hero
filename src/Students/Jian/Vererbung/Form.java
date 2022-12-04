package Students.Jian.Vererbung;

public abstract class Form {

    private Punkt position;
    private double richtung;

    public Form(Punkt pPosition, double pRichtung){
        this.position = pPosition;
        this.richtung = pRichtung;
    }
    public abstract double berechnenFläche();

    public String printInfo(){
        return "Position: X(" + position.getX() + "), Y(" + position.getY() + "), Richtung: " + richtung;
    }

    public Punkt getPosition() {
        return position;
    }

    public void setPosition(Punkt pPosition) {
        this.position = pPosition;
    }

    public double getRichtung() {
        return richtung;
    }

    public void setRichtung(double pRichtung) {
        this.richtung = pRichtung;
    }
    public void versetzen(int pX, int pY){
        this.position.setX(pX);
        this.position.setY(pY);
    }
    public void drehen(double gGrad){
        this.richtung = gGrad;
    }
}