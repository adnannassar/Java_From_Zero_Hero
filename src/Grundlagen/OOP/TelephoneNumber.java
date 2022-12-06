package Grundlagen.OOP;

public class TelephoneNumber {
    private int number;
    private String company;

    public TelephoneNumber(int number, String company) {
        this.number = number;
        this.company = company;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
