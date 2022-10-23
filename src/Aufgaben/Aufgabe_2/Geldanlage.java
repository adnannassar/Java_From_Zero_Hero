package Aufgaben.Aufgabe_2;

import java.util.Scanner;

public class Geldanlage {

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        System.out.print("Anlagebetrag: ");
        Scanner sc = new Scanner(System.in);
        double anlageBetrag = sc.nextDouble();

        System.out.print("Laufzeit: ");
        int laufzeit = sc.nextInt();


        int eingabe;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("1     1,5 % Verzinsung ohne Bonuszahlung");
            System.out.println("2     0,7 % Verzinsung mit 15 € Bonuszahlung");
            System.out.println("3     0,4 % Verzinsung mit 20 € Bonuszahlung");
            System.out.println("4     0,1 % Verzinsung mit 50 € Bonuszahlung");
            System.out.println("5     Fertig");
            System.out.print("Bitte auswählen: ");
            eingabe = sc.nextInt();
            System.out.println("----------------------------------------------");

            switch (eingabe) {
                case 1:
                    System.out.println("Kapital: " + berechneKapital(1.5, 0, anlageBetrag, laufzeit));
                    break;
                case 2:
                    System.out.println("Kapital: " + berechneKapital(0.7, 15, anlageBetrag, laufzeit));
                    break;
                case 3:
                    System.out.println("Kapital: " + berechneKapital(0.4, 20, anlageBetrag, laufzeit));
                    break;
                case 4:
                    System.out.println("Kapital: " + berechneKapital(0.1, 50, anlageBetrag, laufzeit));
                    break;
                case 5:
                    System.out.println("Auf wieder sehen");
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus");
            }
        }
        while (eingabe != 5);
    }

    public static double berechneKapital(double verzinsung, int bonus, double anlageBetrag, int laufzeit) {
        double kapital = 0;
        for (int i = 0; i < laufzeit; i++) {
            kapital += anlageBetrag + (1 + verzinsung / 100) + bonus;
        }
        return kapital;
    }
}
