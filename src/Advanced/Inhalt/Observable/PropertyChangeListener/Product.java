package Advanced.Inhalt.Observable.PropertyChangeListener;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Product {
    private String name;
    private double preis;


    private final PropertyChangeSupport listner;
    private static final String PROPERTY_PREIS = "preis";

    public Product(String name, double preis) {
        this.name = name;
        this.preis = preis;
        listner = new PropertyChangeSupport(this);
    }

    public static String getPROPERTY_PREIS() {
        return PROPERTY_PREIS;
    }

    public PropertyChangeSupport getListner() {
        return listner;
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        listner.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        listner.removePropertyChangeListener(l);
    }

    public void setPreis(double preis) {
        if (this.preis > preis) {
            listner.firePropertyChange(PROPERTY_PREIS, this.preis, preis);
        }
        this.preis = preis;

    }

    public double getPreis() {
        return preis;
    }


}
