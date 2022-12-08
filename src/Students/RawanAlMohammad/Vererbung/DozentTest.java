package Students.RawanAlMohammad.Vererbung;

import Students.RawanAlMohammad.Vererbung.Dozent;

public class DozentTest {
    public static void main(String[] args) {
        Dozent diedozentin  = new Dozent( "Jeen","Musik",'F');
        Dozent derDekan  = new Dozent( "Ali","Mathe",'M');
        System.out.println("Name:" + derDekan.getName() + ", "+ "lehrgebiet:"+ derDekan.getLehrgebiet() +", "+"geschlecht:" +derDekan.getGeschlecht());
        diedozentin.setLehrgebiet("Englisch");
        System.out.println(diedozentin.getLehrgebiet());
    }
}
