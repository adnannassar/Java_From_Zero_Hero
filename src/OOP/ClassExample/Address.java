package OOP.ClassExample;

public class Address {
    private String ort;
    private String straße;
    private int plz;
    private int hausnummer;

    public Address(){
        ort = " ";
        straße = " ";
    }

    public Address(String ort, String straße, int plz, int hausnummer) {
        this.ort = ort;
        this.straße = straße;
        this.plz = plz;
        this.hausnummer = hausnummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

}
