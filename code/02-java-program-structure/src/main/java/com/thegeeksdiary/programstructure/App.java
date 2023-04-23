package com.thegeeksdiary.programstructure;

import java.util.Date;

/**
 * Hello world!
 */
public final class App {
    private String message;

    // Constructor
    public App(String message) {
        this.message = message;
    }

    // Method to print the message with the current date and time
    public void printMessage() {
        System.out.println("Message: " + message);
        System.out.println("Current date and time: " + new Date());
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the BasicJavaStructure class
        App basicJavaStructure = new App("Hello, World!");

        // Call the printMessage method
        basicJavaStructure.printMessage();
    }
}
