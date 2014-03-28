/**
 * 
 */
package com.github.taozhou.strategy.behavior.impl;

import com.github.taozhou.strategy.behavior.QuackBehavior;

/**
 * @author meycine
 * 
 */
public class Squeak implements QuackBehavior {

    public String quack() {

        String quackInfo = "Hi, I can sequack!";
        return quackInfo;

    }

}
