package com.thegeeksdiary.programstructure;

// Parent class
class Parent {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int packagePrivateVar = 4;

    public void publicMethod() {
        System.out.println("This is a public method in Parent class.");
    }

    private void privateMethod() {
        System.out.println("This is a private method in Parent class.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in Parent class.");
    }

    void packagePrivateMethod() {
        System.out.println("This is a package-private (default) method in Parent class.");
    }
}

// Child class that extends Parent
class Child extends Parent {

    public void accessParentMembers() {
        System.out.println("publicVar: " + publicVar);
        // System.out.println("privateVar: " + privateVar); // Error: privateVar has private access in Parent
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("packagePrivateVar: " + packagePrivateVar);

        publicMethod();
        // privateMethod(); // Error: privateMethod() has private access in Parent
        protectedMethod();
        packagePrivateMethod();
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {
        Parent parent = new Parent();

        // Accessing members of Parent class
        System.out.println("Accessing members of Parent class:");
        System.out.println("publicVar: " + parent.publicVar);
        // System.out.println("privateVar: " + parent.privateVar); // Error: privateVar has private access in Parent
        System.out.println("protectedVar: " + parent.protectedVar);
        System.out.println("packagePrivateVar: " + parent.packagePrivateVar);

        parent.publicMethod();
        // parent.privateMethod(); // Error: privateMethod() has private access in Parent
        parent.protectedMethod();
        parent.packagePrivateMethod();

        System.out.println("\nAccessing members of Parent class from Child class:");
        Child child = new Child();
        child.accessParentMembers();
    }
}

