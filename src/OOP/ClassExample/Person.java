package OOP.ClassExample;

public class Person {
    // Attributes
    String name ;// null
    String birthDate;// null
    String password;// null
    String email; // null
    int age; // 0
    Address address;


    // constructor
    public Person(String name, String birthDate, String password, String email, int age,  Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.password = password;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    /*
    *
    *
    *  String ort;
    String straße;
    int plz;
    int  hausnummer;*/
    // Actions
    public void printInfo() {
        System.out.println("Name:    " + name+  "\nBirthDate: " + birthDate+"\n" + "Password: "+ password + "\n"+ "Email: "+ email+ "\nAge: " + age);
        System.out.println("Address: " + address.straße + address.hausnummer + " " + address.plz+ ", "+ address.ort);
    }
}
