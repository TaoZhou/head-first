package com.github.taozhou;

/**
 * Hello world!
 * 
 */
public class App {

    static {
        System.out.println("wo ca ");
    }

    public static void main(final Integer[] args) {

        String name = "Hello wordddld!";
        doPrint(name);
    }

    public static void main(final String[] args) {

        String name = "Hello world!";
        doPrint(name);
    }

    public static void doPrint(final String name) {

        System.out.println(name);
    }
}
