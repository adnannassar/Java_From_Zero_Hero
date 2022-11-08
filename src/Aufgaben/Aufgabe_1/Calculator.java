package Aufgaben.Aufgabe_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Eingeben: ");
        String all = sc.next();

        // to put all operators in one list
        LinkedList<Character> operatorsAsList = new LinkedList<>();
        for (int i = 0; i < all.length(); i++) {
            if (all.charAt(i) == '+' || all.charAt(i) == '-' || all.charAt(i) == '*' || all.charAt(i) == '/') {
                operatorsAsList.add(all.charAt(i));
            }
        }

        // to put all numbers in one list
        String[] numbersAsStringArray = all.split("[*+\\-/]");


        if (numbersAsStringArray.length - 1 == operatorsAsList.size()) {
            int summe = 0;
            for (int i = 0; i < numbersAsStringArray.length - 1; i++) {
                char operator = operatorsAsList.get(i);
                if (i == 0) {
                    switch (operator) {
                        case '+':
                            summe += Integer.parseInt(numbersAsStringArray[i]) + Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                        case '*':
                            summe += Integer.parseInt(numbersAsStringArray[i]) * Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                        case '-':
                            summe += Integer.parseInt(numbersAsStringArray[i]) - Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                        case '/':
                            summe += Integer.parseInt(numbersAsStringArray[i]) / Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                    }
                }else{
                    switch (operator) {
                        case '+':
                            summe += Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                        case '*':
                            summe *= Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                        case '-':
                            summe -= Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                        case '/':
                            summe /=  Integer.parseInt(numbersAsStringArray[i + 1]);
                            break;
                    }
                }

            }
            System.out.print("Ergebnis:" + summe);
        }


    }
}
