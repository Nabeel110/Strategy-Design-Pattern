package com.company;

import Strategies.FlyBehavior;
import Strategies.QuackBehavior;

public class Duck  {
    private FlyBehavior flyBehaviour;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehaviour, QuackBehavior quackBehavior) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehavior = quackBehavior;
    }

    public void executeFly(){
        this.flyBehaviour.fly();
    }

    public void executeQuack(){
        this.quackBehavior.quack();
    }

}
