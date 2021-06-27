package chapterThree;

import chapterThree.components.beverage.Beverage;
import chapterThree.components.beverage.concretes.DarkRoast;
import chapterThree.components.beverage.concretes.Espresso;
import chapterThree.components.beverage.concretes.HouseBlend;
import chapterThree.components.beverage.decorators.Mocha;
import chapterThree.components.beverage.decorators.Soy;
import chapterThree.components.beverage.decorators.Whip;

public class ChapterThree {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        // decorate with Mocha
        beverage2 = new Mocha(beverage2);
        // decorate with second Mocha
        beverage2 = new Mocha(beverage2);
        // decorate with Whip
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        // decorate with Soy
        beverage3 = new Soy(beverage3);
        // decorate with Mocha
        beverage3 = new Mocha(beverage3);
        // decorate with Whip
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
