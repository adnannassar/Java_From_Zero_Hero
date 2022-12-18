package Advanced.MedienVerwaltung;


import java.time.LocalDate;

public abstract class Medium {
    private int id;
    private String title;
    private int jahr;

    private static int counter;


    public Medium(String title, int jahr) {
        this.id = counter++;
        this.title = title;
        this.jahr = jahr;
    }


    public int alter() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - jahr;
    }

    public abstract void druckeDaten();


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
}
