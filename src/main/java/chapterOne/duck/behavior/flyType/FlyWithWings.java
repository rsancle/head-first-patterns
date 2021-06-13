package chapterOne.duck.behavior.flyType;

import chapterOne.duck.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
