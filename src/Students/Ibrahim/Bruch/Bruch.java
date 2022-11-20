package Students.Ibrahim.Bruch;

public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch() {
        this.zaehler = 1;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public Bruch kehrwert() {
        Bruch b = new Bruch(this.nenner, this.zaehler);
        return b;
    }

    public Bruch addieren(Bruch b) {
        Bruch addBruch = new Bruch();
        if (this.nenner == b.nenner) {
            int z = this.zaehler + b.zaehler;
            addBruch.zaehler = z;
            addBruch.nenner = this.nenner;
        } else {
            int n = this.nenner * b.nenner;
            int z1 = this.zaehler * b.nenner;
            int z2 = b.zaehler * this.nenner;
            addBruch.zaehler = z1 + z2;
            addBruch.nenner = n;
        }
        return addBruch;
    }

    public Bruch multiplizieren(Bruch b) {
        Bruch mulBruch = new Bruch();
        mulBruch.zaehler = this.zaehler * b.zaehler;
        mulBruch.nenner = this.nenner * b.nenner;
        return mulBruch;
    }

    @Override
    public String toString() {
        return this.zaehler + " / " + this.nenner;
    }
}



