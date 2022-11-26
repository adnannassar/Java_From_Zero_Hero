package Students.Rojda.Bruch;

public class BruchTest {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(1,2);
        Bruch b2 =new Bruch(2,4);


        System.out.println(b1.kehrwert());

        System.out.println(b2.kehrwert());

        System.out.println(b1.addieren(b2));

        System.out.println(b1.multiplizieren(b2));

    }
}
