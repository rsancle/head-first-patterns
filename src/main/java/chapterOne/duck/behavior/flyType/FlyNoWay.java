package chapterOne.duck.behavior.flyType;

import chapterOne.duck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
