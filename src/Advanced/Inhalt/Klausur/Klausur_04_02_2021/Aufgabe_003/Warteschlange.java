package Advanced.Inhalt.Klausur.Klausur_04_02_2021.Aufgabe_003;

import java.util.ArrayList;
import java.util.List;

public class Warteschlange {
    private List<Bestellung> bestellungen;
    private int maxSize;

    public Warteschlange(int maxSize) {
        this.bestellungen = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public synchronized void enqueue(Bestellung b) {
        if (!isFull()) {
            this.bestellungen.add(b);
        }
    }

    public synchronized Bestellung dequeue() {
        if (!isEmpty()) {
            return this.bestellungen.remove(0);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return this.bestellungen.isEmpty();
    }

    public boolean isFull() {
        return this.bestellungen.size() > maxSize;
    }
}
