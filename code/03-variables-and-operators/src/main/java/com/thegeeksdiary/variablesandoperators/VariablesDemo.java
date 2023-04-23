package com.thegeeksdiary.variablesandoperators;

class Counter {
    // Static (class) variable
    private static int staticCount = 0;

    // Instance variable
    private int instanceCount = 0;

    public void increment() {
        // Local variable
        int localCount = 0;

        // Incrementing the variables
        staticCount++;
        instanceCount++;
        localCount++;

        System.out.println("Static count: " + staticCount +
                           ", Instance count: " + instanceCount +
                           ", Local count: " + localCount);
    }
}

public class VariablesDemo {

    public static void main(String[] args) {
        // Creating two instances of Counter
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        System.out.println("Counter 1:");
        counter1.increment();
        counter1.increment();

        System.out.println("\nCounter 2:");
        counter2.increment();
        counter2.increment();
    }
}

/*
 *
 * In this program, we demonstrate the use of various types of variables:

Local variables: Local variables are declared within a method or a block of code and are only accessible within that scope. In this example, localCount is a local variable within the increment method of the Counter class.

Instance variables: Instance variables are declared within a class but outside any method or block of code. They belong to an instance of the class and have a separate value for each instance. In this example, instanceCount is an instance variable of the Counter class.

Class/static variables: Class or static variables are declared within a class but outside any method or block of code with the static keyword. They belong to the class itself and share the same value across all instances of the class. In this example, staticCount is a class/static variable of the Counter class.

To run this program, save it as VariablesDemo.java, compile it using the command javac VariablesDemo.java, and then run the program using the command java VariablesDemo.
 */
