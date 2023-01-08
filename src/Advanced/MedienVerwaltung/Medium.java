package Advanced.MedienVerwaltung;


import java.time.LocalDate;
import java.util.Objects;

public abstract class Medium implements Comparable<Medium> {
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


    //    bild1.equals(bild2)
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Medium m)) {
            return false;
        }
        if (this.jahr == m.jahr && this.title.equals(m.title)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, jahr);
    }

    @Override
    public int compareTo(Medium m){
        return this.jahr - m.jahr;
    }
}
