package ConcreteClasses;

import Strategies.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck does not fly!!");
    }
}

