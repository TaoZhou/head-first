package com.github.taozhou.strategy;

import com.github.taozhou.strategy.behavior.FlyBehavior;
import com.github.taozhou.strategy.behavior.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public abstract void display();

    public FlyBehavior getFlyBehavior() {

        return flyBehavior;
    }

    public void setFlyBehavior(final FlyBehavior flyBehavior) {

        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {

        return quackBehavior;
    }

    public void setQuackBehavior(final QuackBehavior quackBehavior) {

        this.quackBehavior = quackBehavior;
    }

    public void performFly() {

        flyBehavior.fly();
    }

    public String performQuack() {

        String quackInfo = quackBehavior.quack();

        return quackInfo;
    }
}
