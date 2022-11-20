package Students.Ibrahim.Dozent;

public class DozentTest {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Maira Lüdwig", "Informatik", 'W');
        Dozent derDekan = new Dozent("Paul Korte", "Mathe", 'M');
        derDekan.setDekan(true);

        System.out.println(dieDozentin);
        System.out.println(derDekan);

        dieDozentin.setLehrgebiet("Physic");
        System.out.println(dieDozentin);



    }
}

