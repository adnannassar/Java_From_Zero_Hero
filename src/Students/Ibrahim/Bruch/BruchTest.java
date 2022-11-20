package Students.Ibrahim.Bruch;

public class BruchTest {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(2, 3);
        System.out.println("b1 = " + b1);
        System.out.println("Kehrwert von b1 = " + b1.kehrwert());

        Bruch b2 = new Bruch(2, 3);
        System.out.println("b2 = " + b2);

        System.out.println("b1 + b2 = " + b2.addieren(b1));
        System.out.println("b1 * b2 = " + b2.multiplizieren(b1));

        Bruch b3 = new Bruch(3, 4);
        System.out.println("Kehrwert von b3 = " + b3.kehrwert());
        System.out.println("b2 + b3 = " + b3.addieren(b2));
        System.out.println("b2 * b3 = " + b3.multiplizieren(b2));

    }
}

