package Students.Yahya.Aufgabe_Vererbung.ersteAufgabe;

public class main {
    public static void main(String[] args) {
        Manger manger = new Manger("adnan" , 1200 , 500);
        Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Yahya" , 1500 , 400 , 200);
        System.out.println(manger.getName());
        System.out.println(manger.getPersonalnummer());
        System.out.println(manger.berechneGehalt());
        System.out.println(geschaeftsfuehrer.getName());
        System.out.println(geschaeftsfuehrer.getPersonalnummer());
        System.out.println(geschaeftsfuehrer.berechneGehalt());
    }
}
