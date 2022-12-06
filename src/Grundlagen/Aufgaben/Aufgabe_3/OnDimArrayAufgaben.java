package Grundlagen.Aufgaben.Aufgabe_3;

import java.util.Random;

public class OnDimArrayAufgaben {
    public static void main(String[] args) {

        // 1
        int quadratArray[] = new int[10];
        for (int i = 0; i < quadratArray.length; i++) {
            quadratArray[i] = (int) Math.pow((i + 1), 2);
        }

        // 2
        for (int i = 0; i < quadratArray.length; i++) {
            System.out.print(quadratArray[i] + " ");
        }
        System.out.println();

        // 3
        int summ = 0;
        for (int i = 0; i < quadratArray.length; i++) {
            summ += quadratArray[i];
        }
        System.out.println("Summ = " + summ);

        // 3.1
        System.out.println("Durchschnitt = " + summ / quadratArray.length);

        // 4
        Random random = new Random();
        int[] randomArray = new int[8];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1, 50);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();

        // 4.1
        int min = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
        }
        System.out.println("Min = " + min);

        // 4.2
        int max = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
            }
        }
        System.out.println("Max = " + max);

        // 5
        String[] stringArray = new String[4];
        stringArray[0] = "Mr.Yahya";
        stringArray[1] = "Mrs.Jian";
        stringArray[2] = "Mrs.Rawan";
        stringArray[3] = "Mr.Ahmad";
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + ", ");
        }
        System.out.println();
        // 6
        String tempName = stringArray[1];
        stringArray[1] = stringArray[2];
        stringArray[2] = tempName;
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + ", ");
        }
        System.out.println();

        // 7
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].startsWith("Mr.")) {
                stringArray[i] = stringArray[i].substring(3);
            }

            if (stringArray[i].startsWith("Mrs.")) {
                stringArray[i] = stringArray[i].substring(4);
            }
            System.out.print(stringArray[i] + ", ");
        }
        System.out.println();

        // 8
        System.out.println("ist Alle Gerade: " + isAlleGerade(randomArray));

        // 9
        String[] names = {"ölrich", "Äbo Aädo", "Rawan", "Maya", "ümer", "Öxxa"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
        System.out.println("\nAnzahl Vokalen: " + vokalArray(names));


        String[] names2 = {"Adnan", "abdo", "Rawan", "maya", "Omer", "jian"};
        // 10 check isCapitalized
        for (int i = 0; i < names2.length; i++) {
            System.out.print(names2[i] + ", ");
        }
        System.out.println();
        checkIfArrayCapitalized(names2);
    }


    public static boolean isAlleGerade(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int vokalArray(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            String smallWord = array[i].toLowerCase();
            if (smallWord.startsWith("ä") || smallWord.startsWith("ö") || smallWord.startsWith("ü")) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isCapitalized(String word) {
        return (word.charAt(0) >= 65 && word.charAt(0) <= 90);
    }

    public static void checkIfArrayCapitalized(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isCapitalized(words[i])) {
                System.out.println(words[i] + " is Capitalized");
            } else {
                System.out.println(words[i] + " is not Capitalized");
            }
        }
        int start = 15;
        int array2[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array2[i] = i + 15;
        }
        int summe = 0 ;
        for (int i = 0; i < array2.length; i++) {
            summe += array2[i];
        }

        System.out.println("summe: " + summe);
    }


}
