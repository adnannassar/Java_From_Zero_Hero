package Advanced.Theads.BottleVerwaltung;

public class LabelingMachine implements Runnable {
    private Conveyor c;
    private int delay;

    public LabelingMachine(Conveyor c, int delay) {
        this.c = c;
        this.delay = delay;
    }

    @Override
    public void run() {
        Bottle b;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (c) {
                    while (c.isEmpty()) {
                        c.wait();
                        System.out.println("Etikettiermaschine: Warten, da Foerderband leer.");
                    }
                    b = c.withdraw();
                    c.notifyAll();
                }
                b.setLabel(new Label("Bier", 2019));
                System.out.print("Etikettiermaschine: ");
                b.printLabel();
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted!!");
                Thread.currentThread().interrupt();
            }
        }
    }
}
