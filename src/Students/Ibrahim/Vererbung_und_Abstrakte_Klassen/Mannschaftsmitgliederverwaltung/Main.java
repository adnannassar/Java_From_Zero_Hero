package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mannschaftsmitgliederverwaltung;

public class Main {
    public static void main(String[] args) {
        Spieler sp1 = new Spieler("Götze", "Mario", "Mittelfeld", 5);
        Spieler sp2 = new Spieler("Aubameyang", "Pierre-Emerik", "Sturm", 18);
        Trainer t1 = new Trainer("Tuchel", "Thomas");
        t1.setLiebliengsSpieler(sp2);

        Arzt ar1 = new Arzt("Braun", "Markus", "Orthopädie");


//        System.out.println(sp1);
//        System.out.println(t1);
//        System.out.println(ar1);


//        System.out.printf("%-10s%-10s%-20s%-20s%-20s%s" , "ID", "Type", "Name", "Vorname", "Jahresgehalt", "Spezifische Eigenschaften\n");
//        System.out.println("------------------------------------------------------------------------------------------------");
//        System.out.printf("%-10d%-10s%-20s%-20s%-20.2f%s", sp1.getId() , sp1.getType(sp1), sp1.getName(), sp1.getVorname(), sp1.berechneJahresGehlat(), sp1.getSonstiges());
//        System.out.printf("%-10d%-10s%-20s%-20s%-20.2f%s", sp2.getId() , sp2.getType(sp2), sp2.getName(), sp2.getVorname(), sp2.berechneJahresGehlat(), sp2.getSonstiges());
//        System.out.printf("%-10d%-10s%-20s%-20s%-20.2f%s", t1.getId() , t1.getType(t1), t1.getName(), t1.getVorname(), t1.berechneJahresGehlat(), t1.getSonstiges());
//        System.out.printf("%-10d%-10s%-20s%-20s%-20.2f%s", ar1.getId() , ar1.getType(ar1), ar1.getName(), ar1.getVorname(), ar1.berechneJahresGehlat(), ar1.getSonstiges());
//        System.out.printf("%-60s%f", "Summe der Jaresgehälter: ",
//                sp1.berechneJahresGehlat() + sp2.berechneJahresGehlat() + t1.berechneJahresGehlat()
//                + ar1.berechneJahresGehlat());

        Mannschaft mannschaft = new Mannschaft("Ball-Verein Borussia Dortmund 09", 30);
        mannschaft.addMitglied(sp1);
        mannschaft.addMitglied(sp2);
        mannschaft.addMitglied(t1);
        mannschaft.addMitglied(ar1);
        mannschaft.showMenu();



    }
}
