package Vererbung;

import Aufgaben.Aufgabe_1.For;

public class Main {
    public static void main(String[] args) {
        Quadrat quadrat = new Quadrat(new Punkt(2,2), 0, 2);
        Rechteck rechteck  = new Rechteck(new Punkt(3,5), 180, 2, 6);
        Dreieck dreieck = new Dreieck(new Punkt(1,0), 90,new Punkt(2,7), new Punkt(1,5));
        System.out.println(quadrat.printInfo());
        System.out.println(rechteck.printInfo());
        System.out.println(dreieck.printInfo());

    }
}
