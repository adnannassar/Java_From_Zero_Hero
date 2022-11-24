package Students.Rojda.Bruch;
//مو مخلصة لسى |:
public class Bruch {
    private int zähler;
    private int nenner;

    public Bruch() {
        this.zähler = 1;
        this.nenner = 1;
    }

    public Bruch(int zähler, int nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public int getZähler() {
        return zähler;
    }
    public int getNenner() {
        return nenner;
    }


    public Bruch kehrwert() {
        Bruch b = new Bruch(zähler , nenner);
        b.nenner = zähler;
        b.zähler = nenner;
        return b;
    }

    public Bruch addieren(Bruch b) {
        Bruch addErg = new Bruch();
        if(nenner != nenner){
            nenner = nenner1 * nenner2;
            zähler = (zähler1 * nenner2) +(zähler2 * nenner1);
        }
        else{
            addErg.zähler = zähler1 + zähler2;
            addErg.nenner = nenner1;
        }
        return addErg;
    }

    public Bruch multiplizieren(Bruch b) {
       Bruch multErg = new Bruch();
       multErg.zähler= zähler1 * zähler2;
       multErg.nenner = nenner1 * nenner2;

        return multErg;
    }

    @Override
    public String toString() {
        return zähler + "/" + nenner;
    }
}