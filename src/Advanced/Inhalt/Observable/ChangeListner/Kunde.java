package Advanced.Inhalt.Observable.ChangeListner;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Kunde implements ChangeListener {
    private String name;

    public Kunde(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        System.out.println("Old Preis: " + oldValue + ", new Preis: " + newValue);
    }
}
