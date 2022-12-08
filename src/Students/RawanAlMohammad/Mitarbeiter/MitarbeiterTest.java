package Students.RawanAlMohammad.Mitarbeiter;

import Students.RawanAlMohammad.Mitarbeiter.Geschaeftsfuehrer;
import Students.RawanAlMohammad.Mitarbeiter.Manager;

public class MitarbeiterTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Alex",2.000,1.500);
        Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Jan",1.500,1.200,500.0);

        System.out.println(manager);
        System.out.println(geschaeftsfuehrer);

    }
}
