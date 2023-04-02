package Advanced.Theads.BottleVerwaltung;

public class Main {
    public static void main(String[] args) {
        Conveyor c = new Conveyor();

        Thread btTread = new Thread(new BottlingPlant(c, 1000));
        Thread lmTread = new Thread(new LabelingMachine(c, 1000));


        btTread.start();
        lmTread.start();


    }
}
