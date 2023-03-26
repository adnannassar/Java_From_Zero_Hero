package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_002;

import Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_001.Util;

import java.util.function.Function;
import java.util.function.Predicate;


public class Test {
    public static void main(String[] args) {
        // Anonymes class
        System.out.println("Using Anonymes class:");
        Util.ausgabeFilter(Util.wertetabelle(0.0, 10, new Function<Double, Double>() {
            @Override
            public Double apply(Double x) {
                return Math.pow(x, 3);
            }
        }), new Predicate<Double>() {
            @Override
            public boolean test(Double x) {
                return x % 2 == 0;
            }
        });

        // Lambda
        System.out.println("\nUsing Lambda:");
        Util.ausgabeFilter(Util.wertetabelle(0.0, 10, x -> Math.pow(x, 3)), x -> x % 2 == 0);

    }


}
