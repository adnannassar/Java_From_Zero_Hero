
package Students.AhmadBayram;

public class BDurschnitt {
    public static void main(String[] args) {

        int[][] array = {
                {1, 3, 4, 8},
                {2, 5, 8, 6}
        };
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                counter++;
            }
        }
        int Durchnitt = sum / counter;
        System.out.println("Die Summe beträgt : " + sum);

        System.out.println("Der Durschnitt beträgt: " + Durchnitt);

    }
}

