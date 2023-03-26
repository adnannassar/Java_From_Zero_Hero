package Advanced.Inhalt.Observable.PropertyChangeListener;


import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Kunde implements PropertyChangeListener {
    private String name;

    public Kunde(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Hallo " + this.name + ". ");
        System.out.println("Name: " + evt.getPropertyName());
        System.out.println("Old Value: " + evt.getOldValue());
        System.out.println("New Value: " + evt.getNewValue() + "\n");
    }
}
