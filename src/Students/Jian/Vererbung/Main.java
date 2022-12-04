package Students.Jian.Vererbung;

public class Main {
    public static void main(String[] args) {

        Quadrat quadrat = new Quadrat(new Punkt(2,2), 0,2);
        Rechteck rechteck = new Rechteck(new Punkt(3,2), 90,2, 4);
        Dreieck dreieck = new Dreieck(new Punkt(5,5), 180,new Punkt(0,10), new Punkt(10,5));

        System.out.println(quadrat.printInfo());
        System.out.println(rechteck.printInfo());
        System.out.println(dreieck.printInfo());
        System.out.println("Die Fläche von Dreieck: " + dreieck.berechnenFläche());

    }
}