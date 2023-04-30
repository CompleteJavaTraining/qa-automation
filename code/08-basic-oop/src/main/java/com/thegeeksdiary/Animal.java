package com.thegeeksdiary;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void eat() {
        System.out.println("The " + this.getClass().getSimpleName() + " is eating.");
    }

    public void sleep() {
        System.out.println("The " + this.getClass().getSimpleName() + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("The animal is making a sound.");
    }

    public abstract void move();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}





