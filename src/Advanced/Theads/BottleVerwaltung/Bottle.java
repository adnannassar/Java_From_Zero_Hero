package Advanced.Theads.BottleVerwaltung;

public class Bottle {
    Label label;


    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void printLabel() {
        System.out.println(label.getType()+ " mindestens haltbar bis " + label.getBestBefore());
    }

}
