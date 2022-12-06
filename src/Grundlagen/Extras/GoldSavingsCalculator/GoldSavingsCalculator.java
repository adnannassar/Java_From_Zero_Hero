package Grundlagen.Extras.GoldSavingsCalculator;

import java.util.LinkedList;

public class GoldSavingsCalculator {
    private LinkedList<Gold> goldSavings;

    public GoldSavingsCalculator() {
        this.goldSavings = new LinkedList<>();
    }

    protected double calculateTotalBuyingPrice() {
        return this.goldSavings.stream().map(Gold::getBuyPrice).reduce(0.0, Double::sum);
    }
}
