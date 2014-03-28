/**
 * 
 */
package com.github.taozhou.strategy.behavior.impl;

import com.github.taozhou.strategy.behavior.QuackBehavior;

/**
 * @author meycine
 * 
 */
public class MuteQuack implements QuackBehavior {

    public String quack() {

        String quackInfo = "Hi, please keep silence!";
        return quackInfo;

    }
}
