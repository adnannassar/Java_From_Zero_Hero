package Students.Rojda;

public class DozentTest {
    public static void main (String[]args){
        Dozent dieDozentin = new Dozent("Rawan AlMohammad", "Mathe & Informatik",'F');
        Dozent derDekan = new Dozent("Adnan Nassar", "Informatik" , 'M');

        System.out.println("Der Denker: " + derDekan.getName()+" "+ derDekan.getLehrgebiet()+" "+ derDekan.getGeschlecht());
        dieDozentin.setLehrgebiet("Mathe");
    }
}
