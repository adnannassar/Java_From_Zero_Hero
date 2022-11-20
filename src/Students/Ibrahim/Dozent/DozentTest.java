package Students.Ibrahim.Dozent;

public class DozentTest {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Maira", "Informatik", 'W');
        Dozent derDekan = new Dozent("Paul", "Mathe", 'M');

        System.out.println(dieDozentin);
        System.out.println(derDekan);

        dieDozentin.setLehrgebiet("Physic");
        System.out.println(dieDozentin);

        boolean at2;

    }
}

