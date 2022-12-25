package Advanced.MedienVerwaltung;

import java.util.Objects;

public class Bild extends Medium{
    private String ort;

    public Bild(String title, int jahr, String ort) {
        super(title, jahr);
        this.ort = ort;
    }

    public String getOrt() {
        return ort;
    }

    @Override
    public void druckeDaten() {
        System.out.println("ID = " + getId() + " \""+ getTitle()+ "\" aufgenommen im Jahr "+ getJahr()+" in "+ort);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bild bild)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(ort, bild.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ort);
    }
}
