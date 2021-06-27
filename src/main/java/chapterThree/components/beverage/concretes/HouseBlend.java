package chapterThree.components.beverage.concretes;

import chapterThree.components.beverage.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    public double cost() {
        return .89;
    }

}
