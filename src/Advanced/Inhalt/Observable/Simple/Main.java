package Advanced.Inhalt.Observable.Simple;

import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {





        Firma apple = new Firma("Apple");

        Product p1 = new Product("Iphone 10", 700);
        Product p2 = new Product("Iphone 12", 900);

        apple.addProduct(p1);
        apple.addProduct(p2);

        Kunde k1 = new Kunde("Ahmad");
        Kunde k2 = new Kunde("Ibrahim");

        apple.addKunde(k1);
        apple.addKunde(k2);


        apple.register(k1, p2);

        apple.setPreis(800, p2);


    }
}
