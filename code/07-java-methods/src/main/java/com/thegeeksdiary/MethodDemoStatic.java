package com.thegeeksdiary;

public class MethodDemoStatic {
    // Example of a no input - no output method
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Example of a some input - no output method
    public static void greetByName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Example of a some input - some output method
    //int -> integer
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

    // // Example of using a built-in method
    // public static void printArray(int[] arr) {
    //     System.out.println(Arrays.toString(arr));
    // }

    // Example of a user-defined method
    public static int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
}
