package Students.Ibrahim.Vererbung_und_Abstrakte_Klassen.Mannschaftsmitgliederverwaltung;

import java.util.Scanner;

public class Mannschaft {
    Scanner sc = new Scanner(System.in);
    private String name;
    private Mitglied[] mitglieder;

    public Mannschaft(String name, int capacity) {
        this.name = name;
        mitglieder = new Mitglied[capacity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mitglied[] getMitglieder() {
        return mitglieder;
    }

    public void setMitglieder(Mitglied[] mitglieder) {
        this.mitglieder = mitglieder;
    }

    public void addMitglied(Mitglied mitglied) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = mitglied;
                break;
            }
        }
    }

    private double summeAlleGehälter() {
        double summe = 0.0;
        for (Mitglied mitglied : mitglieder) {
            if (mitglied != null) {
                summe += mitglied.berechneJahresGehlat();
            }
        }
        return summe;
    }

    public void printMitgliederInfos() {
        System.out.println("Mannschaft: " + name + "\n");
        System.out.printf("%-10s%-10s%-20s%-20s%-20s%-20s\n", "ID", "Type", "Name", "Vorname", "Jahresgehalt", "Spezifische Eigenschaften");
        for (int i = 0; i <= 122; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Mitglied mitglied : mitglieder) {
            if (mitglied != null) {
                System.out.printf("%-10d%-10s%-20s%-20s%-20.2f%s\n", mitglied.getId(), mitglied.getType(mitglied), mitglied.getName(), mitglied.getVorname(), mitglied.berechneJahresGehlat(), mitglied.getSonstiges());
            }
        }
        System.out.printf("\n%-60s%f\n\n", "Summe der Jaresgehälter:", summeAlleGehälter());
    }

    public void showMenu() {
        char option = ' ';
        while (option != 'B') {
            printMitgliederInfos();
            System.out.print("""
                    Weitere Aktionen:
                      (A)rzt hinzufügen
                      (S)pieler hizufügen
                      (T)rainer hinzufügen
                      (B)eenden
                     Ihre Eingabe:\s""");
            option = sc.next().charAt(0);
            switch (option) {
                case 'A' -> addArzt();
                case 'S' -> addSpieler();
                case 'T' -> addTrainer();
                case 'B' -> System.out.println("Auf Wiedersehen!");
                default -> System.out.println("Bitte etwas gültiges eingeben: ");
            }
        }
    }

    public void addArzt() {
        System.out.println("Add Arzt");
        System.out.print("Name des Arzt: ");
        String name = sc.next();
        System.out.print("Vorname des Arzt: ");
        String vorname = sc.next();
        System.out.print("Fachrichtung: ");
        String fachrichtung = sc.next();
        addMitglied(new Arzt(name, vorname, fachrichtung));
    }

    public void addSpieler() {
        System.out.println("Add Spieler");
        System.out.print("Name des Spieler: ");
        String name = sc.next();
        System.out.print("Vorname des Spieler: ");
        String vorname = sc.next();
        System.out.print("Spielposition: ");
        String position = sc.next();
        System.out.print("Anzahl der Spielansätze pro Saison: ");
        int anzahl = sc.nextInt();
        addMitglied(new Spieler(name, vorname, position, anzahl));
    }

    public void showSpieler() {
        for (Mitglied mitglied : mitglieder) {
            if (mitglied instanceof Spieler) {
                System.out.println(mitglied);
            }
        }
    }

    public Spieler getSpielerDruchID(int id) {
        for (Mitglied mitglied : mitglieder) {
            if (mitglied.getId() == id && mitglied instanceof Spieler) {
                return (Spieler) mitglied;
            }
        }
        return null;
    }

    public void addTrainer() {
        System.out.println("Add Trainer");
        System.out.print("Name des Trainer: ");
        String name = sc.next();
        System.out.print("Vorname des Trainer: ");
        String vorname = sc.next();
        Trainer trainer = new Trainer(name, vorname);
        System.out.print("Hat der Trainer einen Lieblingsspieler?\n(J)a\n(N)ein\nIhre Eingabe:\s");
        String antwort = sc.next();
        switch (antwort) {
            case "J" -> {
                showSpieler();
                System.out.print("Geben Sie die ID des Lieblingsspieler ein:\s");
                int id = sc.nextInt();
                trainer.setLiebliengsSpieler(getSpielerDruchID(id));
                addMitglied(trainer);
            }
            case "N" -> addMitglied(trainer);
        }
    }


}


