package com.thegeeksdiary;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The bird is chirping.");
    }

    public void fly() {
        System.out.println("The bird is flying.");
    }

    @Override
    public void move(){
        System.out.println("The " + this.getClass().getSimpleName() + " can walk and fly.");
    }
}
