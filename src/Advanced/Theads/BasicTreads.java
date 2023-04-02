package Advanced.Theads;

public class BasicTreads {
    public static void main(String[] args) {
        Runnable loop1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Loop 1: " + i);
                    try {
                        Thread.sleep((int) (Math.random() * 100));
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Runnable loop2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Loop 2: " + i);
                    try {
                        Thread.sleep((int) (Math.random() * 100));
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Thread th1 = new Thread(loop1);
        Thread th2 = new Thread(loop2);

        th1.start();
        th2.start();


        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage()+ " from join");
        }


    }
}





