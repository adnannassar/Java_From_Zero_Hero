package Students.RawanAlMohammad.FußballSpiel;

public class Test {

    public static void main(String[] args) {


        Spieler spieler1 = new Spieler("Goetze", "Mario", "Mittelfeld", 5);
        Spieler spieler2 = new Spieler("Aubameyang", "Pierre-Emerik", "Sturm", 18);
        Trainer trainer = new Trainer("Tuchel", "Thomas", "Pieerre-Emerik Aubameyang");
        Artze arzt = new Artze("Braun", "Markus", "Orthopaedie");
        double summe;
        summe = (spieler1.jahresgehlt() + spieler2.jahresgehlt() + trainer.jahresgehlt() + arzt.jahresgehlt());

        System.out.printf("%s %10s %20s %20s %20s", "Typ", "Name", "Vorname", "Jahresgehalt", "Sonstige" + "\n");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%s %10s %20s %20s %20s", "S", spieler1.getName(), spieler1.getVorname(), spieler1.jahresgehlt(), spieler1.getSpielPosition() + "\n");
        System.out.printf("%s %10s %20s %20s %20s", "S", spieler2.getName(), spieler2.getVorname(), spieler2.jahresgehlt(), spieler2.getSpielPosition() + "\n");
        System.out.printf("%s %10s %20s %20s %20s", "T", trainer.getName(), trainer.getVorname(), trainer.jahresgehlt(), trainer.getLieblingsspieler() + "\n");
        System.out.printf("%s %10s %20s %20s %20s ", "A", arzt.getName(), arzt.getVorname(), arzt.jahresgehlt(), arzt.getFachrichtung() + "\n");
        System.out.println("Jahresgehalt=" + summe);
    }
}

