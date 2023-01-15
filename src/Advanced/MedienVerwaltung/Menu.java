package Advanced.MedienVerwaltung;

import javax.swing.*;

import java.util.InputMismatchException;
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

        int auswahl = 0;
        do {
            boolean auswahlIsOkay;
            do {
                try {
                    System.out.println("\n1. Audio aufnehmen\n" +
                            "2. Bild aufnehmen\n" +
                            "3. Zeige alle Medien\n" +
                            "4. Zeige neues Medium\n" +
                            "5. Berechne durchschnittliches Erscheinungsjahr\n" +
                            "6. Beenden");
                    System.out.print("Bitte Menuepunkt waehlen: ");
                    auswahl = scanner.nextInt();
                    auswahlIsOkay = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Bitte nur zahlen zwischen 1 und 6 eingeben");
                    scanner.nextLine();
                    auswahlIsOkay = false;
                }

            } while (!auswahlIsOkay);

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
        if (title == null) {
            return;
        }

        int jahr = 0;
        boolean jahrIsOkay;
        do {
            try {
                String jahrAsString = JOptionPane.showInputDialog(null, "Erscheinungsjahr");
                if (jahrAsString == null) {
                    return;
                }
                jahr = Integer.parseInt(jahrAsString);
                jahrIsOkay = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte gültiges Erscheinungsjahr eingeben");
                jahrIsOkay = false;
            }
        } while (!jahrIsOkay);


        String ort = JOptionPane.showInputDialog(null, "Ort");
        if (ort == null) {
            return;
        }
        Bild bild = new Bild(title, jahr, ort);
        mv.aufnehmen(bild);

        JOptionPane.showMessageDialog(null, "Bild wurde erfolgreich hinzugefügt!");
    }

    public void addAudioJOptionPane() {
        JOptionPane.showMessageDialog(null, "Erzeugung ein neues Audio");

        String title = JOptionPane.showInputDialog(null, "Title");
        if (title == null) {
            return;
        }

        int jahr = 0;
        boolean jahrIsOkay;
        do {
            try {
                String jahrAsString = JOptionPane.showInputDialog(null, "Erscheinungsjahr");
                if (jahrAsString == null) {
                    return;
                }
                jahr = Integer.parseInt(jahrAsString);
                jahrIsOkay = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte gültiges Erscheinungsjahr eingeben");
                jahrIsOkay = false;
            }
        } while (!jahrIsOkay);


        String interpret = JOptionPane.showInputDialog(null, "Interpret");
        if (interpret == null) {
            return;
        }

        int dauer = 0;
        boolean dauerIsOkay;
        do {
            try {
                String dauerAsString = JOptionPane.showInputDialog(null, "Dauer");
                if (dauerAsString == null) {
                    return;
                }
                dauer = Integer.parseInt(dauerAsString);
                dauerIsOkay = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte gültige Dauer eingeben");
                dauerIsOkay = false;
            }

        } while (!dauerIsOkay);


        Audio audio = new Audio(title, jahr, interpret, dauer);

        mv.aufnehmen(audio);

        JOptionPane.showMessageDialog(null, "Audio wurde erfolgreich hinzugefügt!");
    }

}
