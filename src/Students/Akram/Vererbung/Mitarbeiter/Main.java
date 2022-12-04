package Students.Akram.Vererbung.Mitarbeiter;

public class Main {
    public static void main(String[] args) {
        Geschaeftsfuehrer ahemd = new Geschaeftsfuehrer("Ahemd",3000.00,50.0,300.0);
        Manger akram = new Manger("Akram",2500.00,50.0);
        ahemd.setUmsatz(300.0);
        akram.setUmsatz(200.0);
        System.out.println("Name: "+ahemd.getName()+ "\n" +"Persnalnr: "+ahemd.getPersonalnummer()+ "\n" +"Gehalt: "+ahemd.berechneGehalt());
        System.out.println("-------------------");
        System.out.println("Name: "+akram.getName()+ "\n" +"Persnalnr: "+akram.getPersonalnummer()+ "\n" +"Gehalt: "+akram.berechneGehalt());
    }
    }

