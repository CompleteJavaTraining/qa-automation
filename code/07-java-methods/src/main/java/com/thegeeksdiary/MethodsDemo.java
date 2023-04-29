package com.thegeeksdiary;

import java.util.Arrays;

public class MethodsDemo {

    // Example of a no input - no output method
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Example of a some input - no output method
    public static void greetByName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Example of a some input - some output method
    public static int sum(int a, int b) {
        return a + b;
    }

    // Example of a no input - some output method
    public static int[] generateRandomNumbers() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        return numbers;
    }

    // Example of using a built-in method
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Example of a user-defined method
    public static int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }

    public static void main(String[] args) {

        // Calling a no input - no output method
        greet();

        // Calling a some input - no output method
        greetByName("John");

        // Calling a some input - some output method
        int result = sum(5, 3);
        System.out.println("Result: " + result);

        // Calling a no input - some output method
        int[] numbers = generateRandomNumbers();
        printArray(numbers);

        // Using a user-defined method
        int factorial = calculateFactorial(5);
        System.out.println("Factorial: " + factorial);
    }

}

/*
 * In this program, we demonstrate different kinds of methods in Java:
 *
 * A no input - no output method greet() which simply prints a greeting message to the console.
 * A some input - no output method greetByName(String name) which takes a string input as the name and prints a greeting message with the name.
 * A some input - some output method sum(int a, int b) which takes two integer inputs and returns the sum of the two.
 * A no input - some output method generateRandomNumbers() which generates an array of 5 random numbers between 0 and 9 and returns the array.
 *
 * We also demonstrate the use of built-in methods in Java:
 * The Arrays.toString() method to print an array.
 *
 * And we also demonstrate a user-defined method calculateFactorial(int num) which calculates the factorial of a number recursively.
 *
 * Finally, in the main() method, we call each of these methods with appropriate arguments to demonstrate their functionality.
 */
