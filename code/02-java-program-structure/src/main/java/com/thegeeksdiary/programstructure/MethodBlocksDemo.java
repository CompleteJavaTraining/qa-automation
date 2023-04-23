package com.thegeeksdiary.programstructure;

public class MethodBlocksDemo {

    // Static method without arguments and return value
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Static method with arguments and return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Instance method without arguments and return value
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Instance method with arguments and return value
    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Overloaded method with different number of arguments
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    // Overloaded method with different types of arguments
    public double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Call static methods
        staticMethod();
        int sum = addNumbers(5, 7);
        System.out.println("Sum of 5 and 7: " + sum);

        // Create an instance of MethodBlocksDemo
        MethodBlocksDemo demo = new MethodBlocksDemo();

        // Call instance methods
        demo.instanceMethod();
        double area = demo.calculateArea(5);
        System.out.println("Area of a circle with radius 5: " + area);

        // Call overloaded methods
        int product1 = demo.multiplyNumbers(3, 4);
        System.out.println("Product of 3 and 4: " + product1);

        double product2 = demo.multiplyNumbers(2.5, 4.5);
        System.out.println("Product of 2.5 and 4.5: " + product2);
    }
}

