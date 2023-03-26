package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_001;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Util {


    public static Value[] wertetabelle(double von, int n, java.util.function.Function<Double, Double> f) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than or equal to 1");
        }
        return IntStream.range(0, n)
                .mapToObj(i -> new Value(von + i * 1.0, f.apply(von + i * 1.0)))
                .toArray(Value[]::new);
    }


    public static void ausgabeFilter(Value[] values, java.util.function.Predicate<Double> p) {
        Arrays.stream(values)
                .filter(value -> p.test(value.getX()))
                .forEach(System.out::println);
    }




    static Value[] wertetabelle2(double von, int n, java.util.function.Function<Double, Double> f) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else {
            Value[] values = new Value[n - 1];
            int index = 0;
            for (double i = von; i <= n; i++) {
                values[index++] = new Value(i, f.apply(i));
            }
            return values;
        }
    }
}
