package Advanced.Inhalt.Observable.InvaidtaionListener;


import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;

public class Product {
    private String name;
    private DoubleProperty preis;

    public Product(String name, double preis) {
        this.name = name;
        this.preis = new SimpleDoubleProperty(preis);
    }

    public DoubleProperty getPreis() {
        return preis;
    }

    public void setPreis(double newPreis) {
        this.preis.set(newPreis);
    }

    public void addChangeListener(InvalidationListener listener) {
        preis.addListener(listener);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
