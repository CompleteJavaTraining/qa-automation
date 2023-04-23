package com.thegeeksdiary.programstructure;

public class ConditionalBlocksDemo {

    public static void main(String[] args) {
        int number = -1;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        String message = (number > 0) ? "The number is positive." : (number < 0) ? "The number is negative." : "The number is zero.";
        System.out.println(message);
    }
}



