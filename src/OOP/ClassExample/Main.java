package OOP.ClassExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ahmad", "15.10.2010", "xyz123#", "ahmad123@gmail.com", 30,
                new Address("Dortmund", "neue Straße", 12345, 30));
        p.printInfo();

        System.out.println();
        Person p2 = new Person("Ali", "1.1.2001", "asdasd#", "ali@gmail.com", 25,
                new Address("Dortmund", "neue Straße", 12345, 30));
        p2.printInfo();
    }
}
