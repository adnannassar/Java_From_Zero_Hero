package Students.Yahya.Aufgabe1;

public class test {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("am abdo", "Eidp", 'w');
        Dozent derDekan = new Dozent("Abo abdo", "Ti", 'M');

        System.out.println(dieDozentin);
        System.out.println(derDekan);

        dieDozentin.setLehrgebiet("RuB1");
        System.out.println(dieDozentin);

    }
}
