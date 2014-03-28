/**
 * 
 */
package com.github.taozhou.strategy.behavior.impl;

import com.github.taozhou.strategy.behavior.QuackBehavior;

/**
 * @author meycine
 * 
 */
public class Quack implements QuackBehavior {

    public String quack() {

        String quackInfo = "Hi, I can quack!";
        return quackInfo;

    }
}
