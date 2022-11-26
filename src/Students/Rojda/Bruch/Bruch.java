package Students.Rojda.Bruch;
// ENDLICH :)
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
        Bruch b = new Bruch(this.zähler , this.nenner);
        b.nenner = this.zähler;
        b.zähler = this.nenner;
        return b;
    }

    public Bruch addieren(Bruch b) {
        Bruch addErg = new Bruch();
        if(this.nenner != b.nenner){
           int z = b.nenner * this.nenner;
           int x = (this.zähler * b.nenner);
           int y = (b.zähler * this.nenner);
           addErg.nenner = z;
           addErg.zähler = x + y ;
        }
        else{
            int N = this.zähler + b.zähler;
            addErg.zähler = N;
            addErg.nenner = this.nenner;
        }
        return addErg;
    }

    public Bruch multiplizieren(Bruch b) {
       Bruch multErg = new Bruch();
       multErg.zähler= b.zähler * this.zähler;
       multErg.nenner = b.nenner * this.nenner;

        return multErg;
    }

    @Override
    public String toString() {
        return zähler + "/" + nenner;
    }
}