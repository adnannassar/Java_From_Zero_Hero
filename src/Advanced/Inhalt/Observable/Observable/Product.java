package Advanced.Inhalt.Observable.Observable;


import java.util.Observable;

public class Product extends Observable {
    private String name;
    private double preis;

    public Product(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPreis() {
        return preis;
    }
    public void setPreis(double newPreis) {
        if (newPreis < preis) {
           String msg = "The Preis of ( " + name + " ) ist reduziert --> neue Preis " + newPreis;
            this.preis = newPreis;
           setChanged();
           notifyObservers(msg);
        }

    }
}
