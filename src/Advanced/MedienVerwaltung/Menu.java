package Advanced.MedienVerwaltung;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private MedienVerwaltungTypsicher mv;

    public Menu(MedienVerwaltungTypsicher mv) {
        this.mv = mv;
    }

    public MedienVerwaltungTypsicher getMv() {
        return mv;
    }

    public void showMenu() {

        int auswahl;
        do {
            System.out.println("\n1. Audio aufnehmen\n" +
                    "2. Bild aufnehmen\n" +
                    "3. Zeige alle Medien\n" +
                    "4. Zeige neues Medium\n" +
                    "5. Berechne durchschnittliches Erscheinungsjahr\n" +
                    "6. Beenden");
            System.out.print("Bitte Menuepunkt waehlen: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    addAudioJOptionPane();
                    break;
                case 2:
                    addBildJOptionPane();
                    break;
                case 3:
                    mv.zeigeMedium();
                    break;
                case 4:
                    mv.sucheNeuesMedium();
                    break;
                case 5:
                    System.out.println("Durchschnittliches Erscheinungsjahr: " + mv.berechneErscheinungJahr());
                    break;
                case 6:
                    System.out.println("Danke bis zum nächsten Mal");
                    break;
                default:
                    System.out.println("Bitte etwas gültiges auswählen");
            }
        } while (auswahl != 6);
    }

    public void addBild() {
        System.out.println("Erzeugung ein neues Bild:");

        System.out.print("Bitte Title eingeben: ");
        String title = scanner.next();

        System.out.print("Bitte Jahr eingeben: ");
        int jahr = scanner.nextInt();

        System.out.print("Bitte Ort eingeben: ");
        String ort = scanner.next();

        Bild bild = new Bild(title, jahr, ort);

        mv.aufnehmen(bild);
        System.out.println("Bild wurde erfolgreich hinzugefügt!");

    }
    public void addAudio() {
        System.out.println("Erzeugung ein neues Audio");

        System.out.print("Bitte Title eingeben: ");
        String title = scanner.next();

        System.out.print("Bitte Jahr eingeben: ");
        int jahr = scanner.nextInt();

        System.out.print("Bitte Interpret eingeben: ");
        String interpret = scanner.next();

        System.out.print("Bitte Dauer eingeben: ");
        int dauer = scanner.nextInt();

        Audio audio = new Audio(title, jahr, interpret, dauer);

        mv.aufnehmen(audio);
        System.out.println("Audio wurde erfolgreich hinzugefügt!");

    }
    public void addBildJOptionPane() {
        JOptionPane.showMessageDialog(null, "Erzeugung ein neues Bild");
        String title = JOptionPane.showInputDialog(null, "Title");

        int jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr"));

        String ort = JOptionPane.showInputDialog(null, "Ort");

        Bild bild = new Bild(title, jahr, ort);
        mv.aufnehmen(bild);

        JOptionPane.showMessageDialog(null, "Bild wurde erfolgreich hinzugefügt!");
    }
    public void addAudioJOptionPane(){
        JOptionPane.showMessageDialog(null, "Erzeugung ein neues Audio");

        String title = JOptionPane.showInputDialog(null, "Title");

        int jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr"));

        String interpret = JOptionPane.showInputDialog(null, "Interpret");

        int dauer = Integer.parseInt(JOptionPane.showInputDialog(null, "Dauer"));

        Audio audio = new Audio(title, jahr, interpret, dauer);

        mv.aufnehmen(audio);

        JOptionPane.showMessageDialog(null, "Audio wurde erfolgreich hinzugefügt!");
    }

}
