package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_003;

public class VersandService implements Runnable {

    private Warteschlange warteschlange;
    private int delay;

    public VersandService(Warteschlange warteschlange, int delay) {
        this.warteschlange = warteschlange;
        this.delay = delay;
    }

    @Override
    public void run() {
        Bestellung b;
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (warteschlange) {
                while (warteschlange.isEmpty()) {
                    try {
                        System.err.println("Versandservice: Warten, da Warteschlange leer ist...");
                        warteschlange.wait();
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                b = warteschlange.dequeue();
                warteschlange.notifyAll();
                if (b != null) {
                    Thread taskServiceThread = new Thread(new VersandTask(b));
                    taskServiceThread.start();
                }

            }

            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
