package Advanced.Theads.BottleVerwaltung;

import java.util.LinkedList;

public class Conveyor {
    LinkedList<Bottle> bottles;

    public Conveyor() {
        this.bottles = new LinkedList<>();
    }

    public void load(Bottle b) {
        bottles.add(b);
    }

    public Bottle withdraw() {
        return bottles.remove();
    }

    public boolean isEmpty() {
        return this.bottles.isEmpty();
    }
    public boolean isOverLoaded(){
        return this.bottles.size() >= 50;
    }
}
