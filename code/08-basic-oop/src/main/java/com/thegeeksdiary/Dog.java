package com.thegeeksdiary;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The " + this.getClass().getSimpleName() + " is barking.");
    }

    public void fetch() {
        System.out.println("The " + this.getClass().getSimpleName() + " is fetching.");
    }

    @Override
    public void move(){
        System.out.println("The " + this.getClass().getSimpleName() + " can walk and run.");
    }
}
