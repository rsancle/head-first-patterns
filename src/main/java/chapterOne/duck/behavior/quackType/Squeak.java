package chapterOne.duck.behavior.quackType;

import chapterOne.duck.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
