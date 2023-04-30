package com.thegeeksdiary.random;

import com.thegeeksdiary.MethodsDemoIntance;

public class SomeApp {
    public static void main(String[] args) {

        MethodsDemoIntance instance = new MethodsDemoIntance();
        // Calling a no input - no output method
        instance.greet();

        // Calling a some input - no output method
        instance.greetByName("John");

        // Calling a some input - some output method
        int result = instance.sum(5, 3);
        System.out.println("Result: " + result);

        // Calling a no input - some output method
        int[] numbers = instance.generateRandomNumbers();
        //printArray(numbers);

        // Using a user-defined method
        int factorial = instance.calculateFactorial(5);
        System.out.println("Factorial: " + factorial);
    }
}
