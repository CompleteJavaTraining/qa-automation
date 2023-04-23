package com.thegeeksdiary.variablesandoperators;

public class OperatorsDemo {

    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 3;
        System.out.println("Arithmetic operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators
        System.out.println("\nRelational operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Assignment operators
        int c;
        c = a;
        System.out.println("\nAssignment operators:");
        System.out.println("c = a: " + c);
        c += a;
        System.out.println("c += a: " + c);
        c -= a;
        System.out.println("c -= a: " + c);
        c *= a;
        System.out.println("c *= a: " + c);
        c /= a;
        System.out.println("c /= a: " + c);
        c %= a;
        System.out.println("c %= a: " + c);

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}

/*
 * In this program, we demonstrate the use of various types of operators:

Arithmetic operators: These operators perform basic arithmetic operations like addition, subtraction, multiplication, division, and modulo. In this example, we demonstrate arithmetic operators using the variables a and b.

Relational operators: These operators compare two values and return a boolean result (true or false). They include equality, inequality, greater than, less than, greater than or equal to, and less than or equal to. In this example, we demonstrate relational operators using the variables a and b.

Assignment operators: These operators are used to assign a value to a variable or to modify the value of a variable using arithmetic operations. In this example, we demonstrate assignment operators using the variables a and c.

Logical operators: These operators are used to perform logical operations on boolean values. They include logical AND, logical OR, and logical NOT. In this example, we demonstrate logical operators using the boolean variables x and y.

To run this program, save it as OperatorsDemo.java, compile it using the command javac OperatorsDemo.java, and then run the program using the command java OperatorsDemo.
 */
