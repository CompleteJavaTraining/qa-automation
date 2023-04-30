package com.thegeeksdiary;
public class MethodsDemo {

    public static void main(String[] args) {

        // Calling a no input - no output method
        MethodDemoStatic.greet();

        // Calling a some input - no output method
        MethodDemoStatic.greetByName("John");

        // Calling a some input - some output method
        int result = MethodDemoStatic.sum(5, 3);
        System.out.println("Result: " + result);

        // Calling a no input - some output method
        int[] numbers = MethodDemoStatic.generateRandomNumbers();
        //printArray(numbers);

        // Using a user-defined method
        int factorial = MethodDemoStatic.calculateFactorial(5);
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
