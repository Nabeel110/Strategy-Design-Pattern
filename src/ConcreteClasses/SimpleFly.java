package ConcreteClasses;

import Strategies.FlyBehavior;

public class SimpleFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Duck flies normally!!");
    }
}
