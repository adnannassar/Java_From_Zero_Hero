package Vererbung;

public abstract class Form {
    private Punkt position;
    private double richtung;

    public Form(Punkt pPosition, double pRichtung) {
        this.position = pPosition;
        this.richtung = pRichtung;
    }

    public abstract double berechneFläche();

    public String printInfo(){
       return "Position: X(" + position.getX()+ "), Y("+ position.getY()+"), Richtung: "+ richtung;
    }


    public Punkt getPosition() {
        return position;
    }

    public void setPosition(Punkt position) {
        this.position = position;
    }

    public double getRichtung() {
        return richtung;
    }

    public void setRichtung(double richtung) {
        this.richtung = richtung;
    }

    public void versetzen(int pX, int pY) {
        this.position.setX(pX);
        this.position.setY(pY);
    }
    public void drehen(double pGrad){
        this.richtung = pGrad;
    }
}
