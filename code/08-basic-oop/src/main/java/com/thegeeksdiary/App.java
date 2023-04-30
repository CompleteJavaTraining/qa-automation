package com.thegeeksdiary;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", 3);
        Cat cat1 = new Cat("Whiskers", 2);
        Bird bird1 = new Bird("Tweety", 1);
        Husky huskyDog = new Husky("brown", "siberian", 5);

        System.out.println("The name of the dog is: " + dog1.getName());
        System.out.println("The dog " + dog1.getName() +  " is " + dog1.getAge() + " year old");
        dog1.eat();
        dog1.sleep();
        dog1.makeSound();
        dog1.fetch();

        System.out.println("The name of the cat is: " + cat1.getName());
        System.out.println("The cat " + cat1.getName() +  " is " + cat1.getAge() + " year old");
        cat1.eat();
        cat1.sleep();
        cat1.makeSound();
        cat1.scratch();

        System.out.println("The name of the bird is: " + bird1.getName());
        System.out.println("The bird " + bird1.getName() +  " is " + bird1.getAge() + " year old");
        bird1.eat();
        bird1.sleep();
        bird1.makeSound();
        bird1.fly();

        System.out.println("The name of the dog is: " + huskyDog.getName());
        System.out.println("The dog " + huskyDog.getName() +  " is " + huskyDog.getAge() + " year old and it's fur color is " + huskyDog.getFurColor());
        huskyDog.eat();
        huskyDog.sleep();
        huskyDog.makeSound();
        huskyDog.fetch();
        huskyDog.fetch("ball");
        huskyDog.fetch(5);
    }
}

/*
 * In this program, we have a parent class Animal and three child classes Dog, Cat, and Bird. Each of the child classes extends the Animal class, inheriting all of its fields and methods. The child classes can also override the parent class methods to provide their own implementation.

In the main method, we create instances of each of the child classes and call their methods to demonstrate how inheritance works. The Dog class has its own fetch method, the Cat class has its own scratch method, and the Bird class has its own fly method. However, all of the child classes inherit the eat, sleep, and makeSound methods from the Animal class.
 */
