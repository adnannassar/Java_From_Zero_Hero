package Advanced.Theads.PingPong;

public class PingPong implements Runnable {
    String text;
    int delay;

    public PingPong(String text, int delay) {
        this.text = text;
        this.delay = delay;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new PingPong("Ping", 1000));
        Thread t2 = new Thread(new PingPong("Pong", 1000));
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
        t2.start();
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(text);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("ERROR!");
                Thread.currentThread().interrupt();
            }
        }
    }
}
