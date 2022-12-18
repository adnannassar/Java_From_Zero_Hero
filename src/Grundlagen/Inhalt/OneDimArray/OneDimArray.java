package Grundlagen.Inhalt.OneDimArray;

import java.util.Scanner;

public class OneDimArray {
    public static void main(String[] args) {
        // number sind bewusst
        //                0    1  2  3  4
        int[] numbers = {1000, 2, 3, 4, 90}; // 20 byte
        // System.out.println(numbers[0]); // 1000
        // System.out.println(numbers[numbers.length - 1]); // 90

        // number sind nicht bewusst
        int[] number2 = new int[10]; // {0, 0, 0, 0, 0}
        for (int i = 0; i < number2.length; i++) {
            number2[i] = i + 1;
        }

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        // einfache: byte, short, int, long, float, double, boolean, char
        // komplexe: arrays, String, Klassen, Objekten, Schnittstellen(Interfaces)


        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie bitte ein Zahl ein: ");
        int userInput = scanner.nextInt(); // 17

        int[] allNumbersArray = new int[userInput];
        for (int i = 0; i < allNumbersArray.length; i++) {
            allNumbersArray[i] = i + 1;
        }

        System.out.print("All Numbers:      ");
        for (int i = 0; i < allNumbersArray.length; i++) {
            System.out.print(allNumbersArray[i] + " ");
        }
        System.out.println();
        System.out.print("Filtered Numbers: ");
        for (int i = 0; i < allNumbersArray.length; i++) {
            if (allNumbersArray[i] % 2 != 0) {
                System.out.print(allNumbersArray[i] + " ");
            }
        }
        /*
        System.out.println("2: " + isPrime(2));
        System.out.println("3: " + isPrime(3));
        System.out.println("4: " + isPrime(4));
        System.out.println("9: " + isPrime(9));
        System.out.println("11: " + isPrime(11));
         */
    }

    // 17
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

}
