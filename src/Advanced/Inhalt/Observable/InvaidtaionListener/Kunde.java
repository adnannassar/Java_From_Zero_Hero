package Advanced.Inhalt.Observable.InvaidtaionListener;


import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Kunde implements InvalidationListener {
    private String name;

    public Kunde(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public void invalidated(Observable observable) {
        System.out.println(observable);
    }
}
