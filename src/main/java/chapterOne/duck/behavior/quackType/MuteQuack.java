package chapterOne.duck.behavior.quackType;

import chapterOne.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }

}
