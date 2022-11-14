package OOP.ClassExample;

public class Person {
    // Attributes
    private String name;
    private String birthDate;
    private String password;
    private String email;
    private int age;

    private Address address = new Address();

    private TelephoneNumber telephoneNumbers[] = new TelephoneNumber[3]; // {null,null,null}

    public void addPhoneNumber(TelephoneNumber telephoneNumber) {
        for(int i = 0 ; i<telephoneNumbers.length; i++){
            if(telephoneNumbers[i] == null){
                telephoneNumbers[i] = telephoneNumber;
                break;
            }
        }
    }

    // constructor
    public Person(String name, String birthDate, String password, String email, int age) {
        this.name = name;
        this.birthDate = birthDate;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public TelephoneNumber[] getTelephoneNumbers() {
        return telephoneNumbers;
    }

    public void printInfo() {
        System.out.println("Name:    " + name + "\nBirthDate: " + birthDate + "\n" + "Password: " + password + "\n" + "Email: " + email + "\nAge: " + age);
        System.out.println("Address: " + address.getStraße() + address.getHausnummer() + " " + address.getPlz() + ", " + address.getOrt());
    }
}
