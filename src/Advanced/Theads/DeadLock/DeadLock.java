package Advanced.Theads.DeadLock;

public class DeadLock {

    static A a = new A();
    static B b = new B();


    public static void main(String[] args) {
        new DeadLock();
    }

    public DeadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a.play();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.play();
            }
        });

        t1.start();
        t2.start();
    }


    static class A {
        public synchronized void play() {
            System.out.println("A");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            b.play();
        }
    }

    static class B {
        public synchronized void play() {
            System.out.println("B");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            a.play();
        }
    }


}
