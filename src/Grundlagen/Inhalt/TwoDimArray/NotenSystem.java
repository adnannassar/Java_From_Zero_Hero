package Grundlagen.Inhalt.TwoDimArray;

import java.util.Scanner;

public class NotenSystem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            studentsMarks();
    }

    public static void studentsMarks() {
        System.out.print("Anzahl der Studenten: ");
        int anzahlStudenten = sc.nextInt();

        String[][] array = new String[anzahlStudenten / 3][3];

        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Name of Student " + counter + ": ");
                array[i][j] = sc.next();

                System.out.print("Mark of Student " + counter + ": ");
                array[i][j] += " " + sc.nextFloat();

                counter++;
                System.out.println();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
