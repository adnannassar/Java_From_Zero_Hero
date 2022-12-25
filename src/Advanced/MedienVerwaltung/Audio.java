package Advanced.MedienVerwaltung;


public class Audio extends Medium {
    private String interpret;
    private int dauer;

    public Audio(String title, int jahr, String interpret, int dauer) {
        super(title, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }

    public String getInterpret() {
        return interpret;
    }

    public int getDauer() {
        return dauer;
    }

    @Override
    public void druckeDaten() {
        System.out.println("ID = " + getId() + " \""+ getTitle()+ "\" von "+ interpret+" aus "+ getJahr()+ " spieldauer: " + dauer+" sek.");
    }
}