package Advanced.MedienVerwaltung;

public class MainTypsicher {
    public static void main(String[] args) {

        Bild bild1 = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");
        Bild bild2 = new Bild("Sunset", 2001, "Aleppo");
        Audio audio1 = new Audio("It Means Nothing", 2007, "Stereophonics", 229);
        Audio audio2 = new Audio("Ana Ayesh", 2010, "Amr Diab", 350);

        MedienVerwaltungTypsicher mv = new MedienVerwaltungTypsicher();

        mv.aufnehmen(bild1);
        mv.aufnehmen(bild2);
        mv.aufnehmen(audio1);
        mv.aufnehmen(audio2);

        Menu menu = new Menu(mv);
        menu.showMenu();




    }
}
