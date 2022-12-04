package Students.Akram.Vererbung.Mannschaften;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Spieler goetze = new Spieler("Mario","Götze","Mittelfeld",5);
        Spieler aubameyang = new Spieler("Pierre-Emerik","Aubameyang","Strum",18);
        Trainer tuchel= new Trainer("Thmoas","Tuchel",aubameyang);
        Arzt braun=new Arzt("Markkus","Braun","Orthopädie");
        goetze.jahresGehalt();
        Mitglieder[] list = new Mitglieder[]{goetze,aubameyang,tuchel,braun};


        System.out.printf("%10s %10s %20s %20s %50s", "TYP","NAME", "VORNAME", "JAHRESGEHALT", "SONSTIGES");
        System.out.println();
        System.out.println("___________________________________________________________________________________________________________________");

        String typ = "";
        String sonstiges="";
        Double gehalterSumme=0.0;
        for (Mitglieder i : list){

            if (i instanceof Spieler){
                typ ="S";
                sonstiges ="Position: "+((Spieler) i).getSpielPosition();
            }else if (i instanceof Arzt){
                typ = "A";
                sonstiges = "Fachrichtung: "+((Arzt) i).getFachrichtung();

            }else if (i instanceof Trainer){
                typ ="T";
                sonstiges = "Lieblingspieler: "+((Trainer) i).getLieblingsSpieler().getVorName()+" "+((Trainer) i).getLieblingsSpieler().getName();
            }
            System.out.format("%10s %10s %20s %20f  %50s",typ,i.getName(), i.getVorName(), i.jahresGehalt(),sonstiges);
            System.out.println();
           gehalterSumme += i.jahresGehalt();

        }
        System.out.format("%10s %42f","Summe der Gehalter: ",gehalterSumme);
    }
}
