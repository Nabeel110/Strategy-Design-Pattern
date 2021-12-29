package com.company;

import ConcreteClasses.NoFly;
import ConcreteClasses.NoQuack;
import ConcreteClasses.SimpleFly;
import ConcreteClasses.SimpleQuack;

public class Main {

    public static void main(String[] args) {

        /* This City Duck can quack and fly normally, so we made use if SimpleFlyBehaviour
         * And SimpleQuackBehaviour which are implemented from FlyBehavior and
         * Quack behavior Strategies.
        */
        Duck cityDuck = new Duck(new SimpleFly(), new SimpleQuack());
        System.out.printf("City ");
        cityDuck.executeFly();
        System.out.printf("City ");
        cityDuck.executeQuack();

        /* This rubber Duck cannot quack neither fly normally,
         *  so we made use 0f NoFlyBehaviour
         * And NoQuackBehaviour which are implemented from FlyBehavior and
         * Quack behavior Strategies.
         */
        Duck rubberFuck = new Duck(new NoFly(), new NoQuack());
        System.out.printf("Rubber ");
        rubberFuck.executeFly();
        System.out.printf("Rubber ");
        rubberFuck.executeQuack();


    }
}
