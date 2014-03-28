/**
 * 
 */
package com.github.taozhou.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.taozhou.strategy.behavior.FlyBehavior;
import com.github.taozhou.strategy.behavior.QuackBehavior;
import com.github.taozhou.strategy.behavior.impl.FlyWithWings;
import com.github.taozhou.strategy.behavior.impl.Quack;

/**
 * @author meycine
 * 
 */
public class DuckTest {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    @Test
    public void fly_withMallardDuck_exceptItCanFly() {

        flyBehavior = new FlyWithWings();
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(flyBehavior);
        mallardDuck.performFly();
    }

    @Test
    public void quack_withMallardDuck_exceptItCanQuack() {

        String expectedInfo = "Hi, I can quack!";
        quackBehavior = new Quack();
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setQuackBehavior(quackBehavior);
        String performInfo = mallardDuck.performQuack();

        assertEquals(expectedInfo, performInfo);

    }

}
