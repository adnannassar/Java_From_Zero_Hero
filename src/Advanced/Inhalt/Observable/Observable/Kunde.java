package Advanced.Inhalt.Observable.Observable;

import java.util.Observable;
import java.util.Observer;

public class Kunde implements Observer {
    private String name;

    public Kunde(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void update(Observable o, Object msg) {
        System.out.println(this.name + " got notification: " + msg);
    }
}
