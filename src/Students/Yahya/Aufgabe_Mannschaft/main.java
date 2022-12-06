package Students.Yahya.Aufgabe_Mannschaft;

public class  main {
    public static void main(String[] args) {
        Spieler spieler1 = new Spieler("Götze" , "Mario" , "CM" , 5);
        Spieler spieler2 = new Spieler("Aubameyang" , "Pierre-Emerik" , "CF" , 18);
        Trainer trainer = new Trainer("Tuchel" , "Thomas" , spieler2);
        Artz artz = new Artz("Braun" , "Markus" , "Orthopädie");
    }

}
