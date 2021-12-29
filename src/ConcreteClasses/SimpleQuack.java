package ConcreteClasses;

import Strategies.QuackBehavior;

public class SimpleQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck quacks normally!!");
    }
}
