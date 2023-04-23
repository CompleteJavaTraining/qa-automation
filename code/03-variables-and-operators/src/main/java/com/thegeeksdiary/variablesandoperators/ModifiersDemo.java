package com.thegeeksdiary.variablesandoperators;

// Abstract class with abstract method
abstract class Shape {
    abstract double calculateArea();
}

// Subclass of Shape
class Circle extends Shape {
    private final double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Final class
final class MathUtil {

    //static field
    public static int staticValue = 10;

    //instance field
    public int instanceValue = 10;

    // Static method
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Final method
    public final double multiplyNumbers(double a, double b) {
        return a * b;
    }
}

//any class declared as final cannot have child classes
// class AnotherMathUtil extends MathUtil {

// }


public class ModifiersDemo {

    public static void main(String[] args) {
        // Accessing static method from MathUtil class
        int sum = MathUtil.addNumbers(5, 7);
        System.out.println("Sum of 5 and 7: " + sum);

        // Creating an instance of MathUtil class
        MathUtil mathUtil = new MathUtil();
        double product = mathUtil.multiplyNumbers(2.5, 4.5);
        System.out.println("Product of 2.5 and 4.5: " + product);

        //creating an instance of an abstract class - is not allowed
        //Shape shape = new Shape();

        // Creating an instance of Circle class
        Circle circle = new Circle(5); //calling the constructor
        double area = circle.calculateArea();
        System.out.println("Area of a circle with radius 5: " + area);

        //accessing static vs instance fields/variables
        System.out.println(MathUtil.staticValue);
        System.out.println(mathUtil.instanceValue);
    }
}

/*
 * In this program, we demonstrate the use of various modifiers:

Access modifiers: These control the visibility of class members. In this example, the Circle class has a private field radius and a public constructor. The MathUtil class has a public static method addNumbers and a public final method multiplyNumbers.

static: Static members belong to the class rather than an instance of the class. They can be called without creating an instance of the class. In this example, addNumbers is a static method in the MathUtil class.

final: Final variables cannot be changed once they are assigned a value. Final methods cannot be overridden by subclasses. Final classes cannot be extended. In this example, radius is a final variable in the Circle class, multiplyNumbers is a final method in the MathUtil class, and the MathUtil class itself is a final class.

abstract: Abstract classes cannot be instantiated, and they can have abstract methods. Abstract methods must be implemented by any concrete (non-abstract) subclass. In this example, Shape is an abstract class with an abstract method calculateArea. The Circle class extends Shape and provides an implementation for the calculateArea method.

To run this program, save it as ModifiersDemo.java, compile it using the command javac ModifiersDemo.java, and then run the program using the command java ModifiersDemo.
 */
