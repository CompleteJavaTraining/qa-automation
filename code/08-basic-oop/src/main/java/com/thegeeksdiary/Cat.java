package com.thegeeksdiary;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat is meowing.");
    }

    public void scratch() {
        System.out.println("The cat is scratching.");
    }

    @Override
    public void move(){
        System.out.println("The " + this.getClass().getSimpleName() + " can walk, run and jump.");
    }
}
