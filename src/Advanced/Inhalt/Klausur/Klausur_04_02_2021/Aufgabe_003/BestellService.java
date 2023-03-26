package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_003;

public class BestellService implements Runnable {

    private Warteschlange warteschlange;
    private int delay;

    public BestellService(Warteschlange warteschlange, int delay) {
        this.warteschlange = warteschlange;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (warteschlange) {
                while (warteschlange.isFull()) {
                    try {
                        warteschlange.wait();
                        System.err.println("Bestellservice: Warten, da Warteschlange leer voll...");
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                warteschlange.enqueue(new Bestellung());
                System.out.println("Bestellservice: Neue Bestellung wurde eingestellt!");
                warteschlange.notifyAll();
            }
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

        }

    }
}
