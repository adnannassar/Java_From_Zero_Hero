package Students.Jian.MannschaftVererbung;

public class Main {
    public static void main(String[] args) {

        Spieler spieler1 = new Spieler("Goetze", "Mario","Mittelfeld", 5);
        Spieler spieler2 = new Spieler("Aubameyang", "Pierre-Emerik","Sturm", 18);
        Trainer trainer = new Trainer("Tuchel", "Thomas",new Spieler("Aubameyang", "Pierre-Emerik", "Struma", 18));
        Arzt arzt = new Arzt("Braun", "Markus","Orthopädie");


    }
}