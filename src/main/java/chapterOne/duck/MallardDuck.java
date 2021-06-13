package chapterOne.duck;

import chapterOne.duck.behavior.flyType.FlyWithWings;
import chapterOne.duck.behavior.quackType.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
