package ConcreteClasses;

import Strategies.QuackBehavior;

public class NoQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Duck does not Quack!!");
    }
}
