package Advanced.Inhalt.Observable.ChangeListner;


import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;

import java.util.Observable;

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

    public void addChangeListener(ChangeListener listener) {
        preis.addListener(listener);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
