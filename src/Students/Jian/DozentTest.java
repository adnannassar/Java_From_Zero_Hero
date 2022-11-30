package Students.Jian.Dozent;

public class DozentTest {

    public static void main(String[] args) {

        Dozent dieDozentin = new Dozent("Janin", "Datenbanken", 'w');
        Dozent derDekan = new Dozent("Felix","Informatik", 'm' );
        dieDozentin.PrintInfo();
        System.out.println();
        dieDozentin.setLehrgebiet("Algorithmen");
        dieDozentin.PrintInfo();
        System.out.println();

        derDekan.setDekan(true);
        if(derDekan.isDekan(true)) {
            System.out.println(derDekan.getName() + ": ist Dekan");
            derDekan.PrintInfo();
        }
    }
}




