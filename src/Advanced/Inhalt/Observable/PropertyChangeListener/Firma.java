package Advanced.Inhalt.Observable.PropertyChangeListener;


public class Firma {
    public static void main(String[] args) {
        Product p1 = new Product("Iphone 10", 700);
        Product p2 = new Product("Iphone 12", 900);

        Kunde k1 = new Kunde("Ahmad");
        Kunde k2 = new Kunde("Ibrahim");

        p1.addPropertyChangeListener(k1);
        p1.addPropertyChangeListener(k2);

        p1.removePropertyChangeListener(k2);
        p2.addPropertyChangeListener(k2);
        p1.setPreis(800);
        p2.setPreis(950);

    }
}
