package com.thegeeksdiary;

public class Husky extends Dog {
    String furColor = "";
    public Husky(String furColor, String name, int age) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor(){
        return furColor;
    }

    public void fetch(String object) {
        System.out.println("The " + this.getClass().getSimpleName() + " is fetching " + object + ".");
    }

    public void fetch(int numberOfObjects) {
        System.out.println("The " + this.getClass().getSimpleName() + " is fetching " + numberOfObjects + " objects.");
    }
}
