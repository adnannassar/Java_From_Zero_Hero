package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_003;

public class VersandTask implements Runnable {
    private Bestellung bestellung;

    public VersandTask(Bestellung bestellung) {
        this.bestellung = bestellung;
    }

    @Override
    public void run() {
        System.out.println("Versandservice: versand task wurde gestartet!");
    }
}
