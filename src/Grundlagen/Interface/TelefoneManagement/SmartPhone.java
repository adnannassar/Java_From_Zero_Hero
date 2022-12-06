package Grundlagen.Interface.TelefoneManagement;


import java.time.LocalTime;

public class SmartPhone extends Telefon implements Uhr {
    private double displaygröße;
    private SMS messages[];

    public SmartPhone(int id, String rufnummer, double displaygröße) {
        super(id, rufnummer);
        this.displaygröße = displaygröße;
        messages = new SMS[1000]; // {null,  null ...... null}
    }

    public double getDisplaygröße() {
        return displaygröße;
    }

    public int getAnzahlSMS() {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void addSMS(int empfängerId, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = new SMS(empfängerId, text);
                break;
            }
        }
    }

    public void ausgabeSMS() {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                System.out.println(messages[i]);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Displaygröße: " + displaygröße ;
    }

    @Override
    public LocalTime getUhrzeit() {
        return LocalTime.now();
    }


}
