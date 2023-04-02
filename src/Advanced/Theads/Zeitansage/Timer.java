package Advanced.Theads.Zeitansage;

public class Timer implements Runnable {
    private TimeListener timeListener;
    private int delay;

    public Timer(TimeListener timeListener, int delay) {
        this.timeListener = timeListener;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            timeListener.signalPerformed();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Interrupted !!");
                Thread.currentThread().interrupt();
            }
        }
    }
}
