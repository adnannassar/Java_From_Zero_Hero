package Students.RawanAlMohammad.FußballSpiel;

public class Trainer extends Mitglieder{
    private String lieblingsspieler;


    public Trainer(String name, String vorname, String lieblingsspieler) {
        super(name, vorname);
        this.lieblingsspieler = lieblingsspieler;
    }

    public String getLieblingsspieler() {
        return lieblingsspieler;
    }

    public void setLieblingsspieler(String lieblingsspieler) {
        this.lieblingsspieler = lieblingsspieler;
    }




    @Override
    public double jahresgehlt() {
        return 165000.0*12;
    }
}
