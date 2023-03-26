package Advanced.Inhalt.Observable.Simple;

import java.util.*;

public class Firma {
    private String name;
    private LinkedList<Product> products;
    private LinkedList<Kunde> kunden;

    private Map<Product, Kunde> kunden_product;


    public Firma(String name) {
        this.name = name;
        this.products = new LinkedList<>();
        this.kunden = new LinkedList<>();
        this.kunden_product = new HashMap<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void addKunde(Kunde k) {
        kunden.add(k);
    }

    public void register(Kunde k, Product p) {
        this.kunden_product.put(p, k);
    }

    public void setPreis(double newPreis, Product p) {
        if (newPreis < p.getPreis()) {
            Kunde k = this.kunden_product.get(p);
            if (k != null) {
                System.out.println("Hallo Herr/Frau "
                        + k.getName() + ", Der Pries von " + p.getName() + " ist reduziert. Alte Preis: " + p.getPreis() + ", Neue Preis: " + newPreis );
            }
        }
        p.setPreis(newPreis);
    }
}
