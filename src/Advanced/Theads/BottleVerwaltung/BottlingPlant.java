package Advanced.Theads.BottleVerwaltung;

public class BottlingPlant implements Runnable {
    private Conveyor c;
    private int delay;

    public BottlingPlant(Conveyor c, int delay) {
        this.c = c;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (c) {
                    while (c.isOverLoaded()) {
                        c.wait();
                    }
                    c.load(new Bottle());
                    c.notifyAll();
                    System.out.println("Abfuellanlage: Neue Flasche abgefuellt");
                }
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted!!");
                Thread.currentThread().interrupt();
            }

        }
    }
}
