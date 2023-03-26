package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_001;

public class Value {
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Value(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y=f(x): " + y;
    }
}
