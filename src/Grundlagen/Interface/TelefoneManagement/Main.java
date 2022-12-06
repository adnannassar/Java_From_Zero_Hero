package Grundlagen.Interface.TelefoneManagement;

public class Main {
    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone(1, "0167761923", 6.60);
        System.out.println(iphone.getUhrzeit());

        iphone.addSMS(2, "Hallo, how are u?");
        iphone.addSMS(2, "why are u now answering?");
        iphone.addSMS(2, "r u okay?");
        iphone.addSMS(3, "im on the way");

        System.out.println(iphone.getAnzahlSMS());
        iphone.ausgabeSMS();

        System.out.println(iphone);



    }
}
