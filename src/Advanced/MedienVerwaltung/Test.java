package Advanced.MedienVerwaltung;

import java.util.HashSet;


public class Test {
    public static void main(String[] args) {
        Bild bild1 = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");
        Bild bild2 = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");

        Audio audio1 = new Audio("It Means Nothing", 2007, "Stereophonics1", 229);
        Audio audio2 = new Audio("It Means Nothing", 2007, "Stereophonics2", 300);



        System.out.println(bild1.equals(bild2));

        System.out.println("Bild1  hashcode: " + bild1.hashCode());
        System.out.println("Bild2  hashcode: " + bild2.hashCode());
        System.out.println("Audio  hashcode: " + audio1.hashCode());
        System.out.println("Audio  hashcode: " + audio2.hashCode());

        HashSet<Medium> hashSet = new HashSet<>();
        hashSet.add(bild1);
        hashSet.add(bild2);
        hashSet.add(audio1);
        hashSet.add(audio2);
        for(Medium m: hashSet){
            m.druckeDaten();
        }
    }
}
