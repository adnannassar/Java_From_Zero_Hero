package Grundlagen.Inhalt.TwoDimArray;

public class Übung {
    public static void main(String[] args) {
        // i = 3,   j = 5
        int[][] numbers = {{10, 2, 3, 4, 5, 1},
                {4, 5, 6, 1},
                {8, 9, 1, -5, 1, 10, -100, 30, 0}};
        minimum(numbers);

        char[][] feld = {
                {'*', 'a', '*'},
                {'*', '*', '*'},
                {'b', 'c', '0'}
        };
        berechneSterneProZeile(feld);


        String[][] studentNames = {
                {"Ahmad", "Jian", "Rojda"},
                {"Rawan", "Saif", "Yahya"}
        };
        lengthOfStudentName(studentNames);

    }


    public static void minimum(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Min = " + min);
    }

    public static void berechneSterneProZeile(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '*') {
                    counter++;
                }
            }
            System.out.println(i + ": " + counter);
        }
    }

    public static void lengthOfStudentName(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Student[" + i + "][" + j + "] = "+ array[i][j].length());
            }
        }
    }
}
