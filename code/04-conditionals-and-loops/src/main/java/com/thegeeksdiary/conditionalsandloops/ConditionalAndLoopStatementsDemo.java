package com.thegeeksdiary.conditionalsandloops;
public class ConditionalAndLoopStatementsDemo {

    public static void main(String[] args) {
        int number = 7;

        // If statement
        if (number % 2 == 0) {
            System.out.println("Number is even.");
        }

        // If-else statement
        if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        // If-else-if statement
        if (number < 0) {
            System.out.println("Number is negative.");
        } else if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is zero.");
        }

        int first = 10; int second=70; int third = 8; int fourth=2;

        if(first>second){
            if(first>third){
                if(first>fourth){
                    System.out.println("First is the largest number.");
                }
                else {
                    System.out.println("Fourth is the largest number.");
                }
            } else {
                if(third>fourth){
                    System.out.println("Third is the largest number.");
                }else {
                    System.out.println("Fourth is the largest number.");
                }
            }
        } else {
            System.out.println("First is not the largest number.");
        }

        // Switch statement
        int day = 3;
        System.out.print("Day " + day + " is ");
        switch (day) {
            case 1:
                System.out.println("Monday.");
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday.");
                break;
            case 4:
                System.out.println("Thursday.");
                break;
            case 5:
                System.out.println("Friday.");
                break;
            case 6:
                System.out.println("Saturday.");
                break;
            case 7:
                System.out.println("Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
        }

        // For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}

