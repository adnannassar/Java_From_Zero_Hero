package Advanced.MedienVerwaltung;


import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Audio extends Medium implements Serializable {
    private String interpret;
    private int dauer;
    private static final long serialVersionUID = 2L;

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
    public void druckeDaten(OutputStream stream) {
        PrintWriter printWriter = new PrintWriter(stream);
        printWriter.printf("ID = %d \"%s\" von %s aus %d spieldauer: %d sek.\n", getId(), getTitle(), interpret, getJahr(), dauer);
        printWriter.flush();
    }

    @Override
    public void druckeDaten() {
        System.out.println("ID = " + getId() + " \"" + getTitle() + "\" von " + interpret + " aus " + getJahr() + " spieldauer: " + dauer + " sek.");
    }

}