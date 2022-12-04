package Students.Akram.Bruch;

public class BruchTest {
    public static void main(String[] args) {
        Bruch a= new Bruch(1,2);
        Bruch b= new Bruch(1,2);

        System.out.println("Kehrwert = " +  a.kehrwert().toString());
        b.addieren(a);
        System.out.println("Addition = " + b.addieren(a).toString());
        b.multiplizieren(a);
        System.out.println("Multipizieren = "+ b.multiplizieren(a).toString());

    }
}
