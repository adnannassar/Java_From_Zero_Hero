package Students.Akram.Bruch;


public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch (){
        zaehler=1;
        nenner=1;
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

    public Bruch kehrwert(){
        Bruch kehrwert = new Bruch();
        kehrwert.zaehler = this.nenner;
        kehrwert.nenner = this.zaehler;
        return kehrwert;
    }

    public Bruch addieren(Bruch b){
        Bruch meinBruch = new Bruch();

            meinBruch.zaehler = (this.zaehler * b.nenner) + (this.nenner * b.zaehler);
            meinBruch.nenner = (this.nenner * b.nenner);
            return meinBruch;
    }
    public Bruch multiplizieren(Bruch b){
        Bruch meinBruch = new Bruch();
        meinBruch.zaehler= this.zaehler * b.zaehler;
        meinBruch.nenner = this.nenner * b.nenner;
        return meinBruch;
    }

    public String toString(){
     return zaehler +"/" +nenner  ;
    }

}