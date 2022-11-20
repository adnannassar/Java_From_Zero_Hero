package Students.Akram.Dozent;

public class DozentTest {

    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Anna Müller","Mathe",'F');
        Dozent derDekan = new Dozent("Danial Klein","Bio",'M');
        derDekan.setDekan(true);

        System.out.println(derDekan.getName() + " " + derDekan.getLehrgebiet() + " " + derDekan.getGechlecht());
        dieDozentin.setLehrgebiet("AP1");



    }

}