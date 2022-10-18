package Aufgaben.Aufgabe_1;

import java.util.Scanner;

public class DosenRechner {
    public static double radius;// global variable  0.0
    public static double höhe; // global variable
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        readInput();
        dosenInfo();
        dosenErg();
    }

    public static void readInput() {
        System.out.print("Geben Sie Radius ein: ");
        radius = myScanner.nextDouble();
        System.out.print("Geben Sie Höhe ein: ");
        höhe = myScanner.nextDouble();
    }

    public static void dosenInfo() {
        System.out.println("Dose Informationen: (Radius: " + radius + ", Höhe: " + höhe + ")");
    }

    public static void dosenErg() {
        System.out.println("umfang: " + umfang());
        System.out.println("deckelfläche: " + deckelfläche());
        System.out.println("mantelfläche: " + mantelfläche());
        System.out.println("oberfläche: " + oberfläche());
        System.out.println("volumen: " + volumen());
    }

    public static double umfang() {
        return 2 * Math.PI * radius;
    }

    public static double deckelfläche() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double mantelfläche() {
        return umfang() * höhe;
    }

    public static double oberfläche() {
        return 2 * deckelfläche() + mantelfläche();
    }

    public static double volumen() {
        return deckelfläche() * höhe;
    }


}
