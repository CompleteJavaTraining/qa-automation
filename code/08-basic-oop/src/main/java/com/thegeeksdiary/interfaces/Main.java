package com.thegeeksdiary.interfaces;

interface Automobile {
    void start();
    void stop();
    int getFuelLevel();
}

class Car implements Automobile {
    int fuelLevel;
    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopping.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}

class Truck implements Automobile {
    private int fuelLevel;

    public Truck(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("The truck is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The truck is stopping.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}

public class Main {
    public static void main(String[] args) {
        Automobile car = new Car(50);
        Automobile truck = new Truck(100);

        car.start();
        truck.start();

        car.stop();
        truck.stop();

        System.out.println("The car has " + car.getFuelLevel() + " units of fuel.");
        System.out.println("The truck has " + truck.getFuelLevel() + " units of fuel.");
    }
}

