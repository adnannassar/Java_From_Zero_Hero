import java.util.Scanner;

public class Folge {

    public static void main(String[] args) {

        System.out.println("1   Collatz-Folge für n");
        System.out.println("2   Länge der Collatz-Folge für n");
        System.out.println("3    Fertig");

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein");
        int Zahl = input.nextInt();

        if (Zahl<1 || Zahl>3){
            System.out.println("1   Collatz-Folge für n");
            System.out.println("2   Länge der Collatz-Folge für n");
            System.out.println("3    Fertig");
        }

    }

    public static void  berechneCollatzFolge(int n){

        Scanner out = new Scanner(System.in);
        System.out.println("Geben Sie n ein");
        int zahl = out.nextInt();

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while (zahl > 1) {

            if (zahl % 2 == 0) {
                zahl = zahl / 2;
                counter1++;
                System.out.println(zahl);
                System.out.println("Counter1 : " +counter1);

            } else if (zahl / 3 == 0) {
                zahl = zahl /3;
                counter2++;
                System.out.println(zahl);
                System.out.println("Counter2 : "+counter2);

            }
            else {
                zahl = 3*zahl+1;
                counter3++;
                System.out.println(zahl);
                System.out.println("Counter3: " +counter3);

            }
        }

    }
}



