package Grundlagen.OOP;


public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Ahmad", "15.10.2010", "xyz123#", "ahmad123@gmail.com", 30);

        // Address address = new Address("Dortmund", "neue Straße", 12345, 30);
        // p1.setAddress(address);

        p1.addPhoneNumber(new TelephoneNumber(1234512331, "Vodafone"));
        p1.addPhoneNumber(new TelephoneNumber(2222222, "1&1"));

        // p1.printInfo();

        System.out.println(p1.getTelephoneNumbers()[0].getNumber() + " " + p1.getTelephoneNumbers()[0].getCompany());
        System.out.println(p1.getTelephoneNumbers()[1].getNumber() + " " + p1.getTelephoneNumbers()[1].getCompany());

    }
}
