package Students.Jian.MitarbeiterVererbung;

public class MitarbeiterTest {
    public static void main(String[] args) {

        Manager manager = new Manager("Anna Schiefer", 2500, 1000);
        Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Louis Müller", 3500, 1500, 1000);
        manager.setPersonalnummer(14526);
        geschaeftsfuehrer.setPersonalnummer(26849);
        manager.PrintInfoManager();
        System.out.println();
        geschaeftsfuehrer.PrintInfoGeschaeftsfuehrer();

    }
}