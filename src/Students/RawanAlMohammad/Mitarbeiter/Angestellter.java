package Students.RawanAlMohammad.Mitarbeiter;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt;
    private double ortszuschlag;
    private double zulage;


   public Angestellter (String name, double gGehalt, double ortszus, double zulage){
       super(name);
       this.grundgehalt = gGehalt;
       this.ortszuschlag = ortszus;
       this.zulage = zulage;
   }

    @Override
    public double berechneGehalt(){
       return 0;
    }
}
