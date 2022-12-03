package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mitarbeiterverwaltung;

public class MitarbeiterTest {
    public static void main(String[] args) {
        Manager m = new Manager("Thomas Heinrich", 4500.00, 1500.00);
        Geschaeftsfuehrer g =
                new Geschaeftsfuehrer("Alex Steiner", 5500.00, 2000.00, 500.00);

        System.out.println(m);
        System.out.println(g);
    }
}
