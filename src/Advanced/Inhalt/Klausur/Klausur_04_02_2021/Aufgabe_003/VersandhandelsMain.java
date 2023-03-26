package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_003;

public class VersandhandelsMain {

    public static void main(String[] args) {
        Warteschlange warteschlange = new Warteschlange(5);
        Thread t = new Thread(new BestellService(warteschlange, 2000));
        Thread t2 = new Thread(new VersandService(warteschlange, 2000));
        t.start();
        t2.start();
    }
}
