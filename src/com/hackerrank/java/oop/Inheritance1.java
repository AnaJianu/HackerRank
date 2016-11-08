package com.hackerrank.java.oop;

/**
 * This means that a Bird object has all the properties that an Animal object has,
 * as well as some additional unique properties.
 * The code above is provided for you in your editor.
 * You must add a sing method to the Bird class, then modify the main method accordingly
 * so that the code prints the following lines:
 * I am walking
 * I am flying
 * I am singing
 */
public class Inheritance1 {
    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
