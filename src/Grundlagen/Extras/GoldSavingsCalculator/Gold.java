package Grundlagen.Extras.GoldSavingsCalculator;

public class Gold {
    private Crate crate;
    private double weight;
    private double buyPrice;

    public Gold(Crate crate, double weight, double buyPrice) {
        this.crate = crate;
        this.weight = weight;
        this.buyPrice = buyPrice;
    }

    public Crate getCrate() {
        return crate;
    }

    public void setCrate(Crate crate) {
        this.crate = crate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }
}
