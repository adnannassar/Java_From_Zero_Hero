package Advanced.MedienVerwaltung;

import java.io.*;
import java.util.*;

public class MedienVerwaltungTypsicher {
    private LinkedList<Medium> medien;

    public MedienVerwaltungTypsicher() {
        this.medien = new LinkedList<>();
    }

    public void aufnehmen(Medium m) {
        medien.add(m);

    }

    public void zeigeMedium(OutputStream stream) {
        // ErscheinungJahrComparator eJc = new ErscheinungJahrComparator();
        /* medien.sort(new Comparator<Medium>() {
            @Override
            public int compare(Medium o1, Medium o2) {
                return o1.getJahr() - o2.getJahr();
            }
        });
        */
        /*
        Collections.sort(medien, new Comparator<Medium>() {
            @Override
            public int compare(Medium o1, Medium o2) {
                return o1.getJahr() - o2.getJahr();
            }
        });
         */
        if (!medien.isEmpty()) {
            Collections.sort(medien);
            Iterator<Medium> it = medien.iterator();
            while (it.hasNext()) {
                it.next().druckeDaten(stream);
            }
        } else {
            System.out.println("Medien Liste ist leer!!");
        }

    }

    public void sucheNeuesMedium() {
        if (!medien.isEmpty()) {
            Medium neuesteMediumAlter = medien.get(0);
            for (Medium m : medien) {
                if (m.alter() < neuesteMediumAlter.alter()) {
                    neuesteMediumAlter = m;
                }
            }
            System.out.print("Das neuste Medium ist: ");
            neuesteMediumAlter.druckeDaten();
        }
    }

    public double berechneErscheinungJahr() {
        double summeJahren = 0.0;

        for (Medium m : medien) {
            summeJahren += m.getJahr();
        }
        return summeJahren / medien.size();
    }




    public void medienListeSpeichern() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("IO_Files/Medien IO Files/medien liste.ser")))) {
            objectOutputStream.writeObject(medien);
            System.out.println("Medien Liste wurde erfolgreich gespeichert!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void medienListeLaden() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("IO_Files/Medien IO Files/medien liste.ser"))) {
            medien = (LinkedList<Medium>) objectInputStream.readObject();
            System.out.println("Medien Liste wurde erfolgreich geladen!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
