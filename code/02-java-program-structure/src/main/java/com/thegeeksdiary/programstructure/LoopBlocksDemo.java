package com.thegeeksdiary.programstructure;

public class LoopBlocksDemo {

    public static void main(String[] args) {
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        System.out.println("\nEnhanced for loop example:");
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        System.out.println("\nWhile loop example:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        System.out.println("\nDo-while loop example:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);
    }
}

