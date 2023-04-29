package com.thegeeksdiary;

import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example of try-catch block
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = 10 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Example of try-catch-finally block
        try {
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();
            // Assume that we are trying to read the contents of the file
            // but it does not exist
            Scanner fileScanner = new Scanner(new java.io.File(filePath));
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}

/*
 * In this program, we demonstrate exception handling in Java using try-catch and try-catch-finally blocks.
 * First, we create a Scanner object to read input from the user.
 *
 * Then, we demonstrate the use of try-catch block by asking the user to enter a number and calculating the result of dividing 10 by that number.
 * If the user enters 0, we get an ArithmeticException which is caught in the catch block. We print an error message indicating that an error has occurred.
 *
 * Next, we demonstrate the use of try-catch-finally block by asking the user to enter the file path and trying to read the contents of the file.
 * If the file does not exist, we get a FileNotFoundException which is caught in the catch block. We print an error message indicating that an error has occurred.
 * Regardless of whether an exception occurs or not, we close the Scanner object in the finally block.
 *
 * Note that we have intentionally used different types of exceptions in each block to show that the catch block only catches the exceptions that match the type of the exception thrown in the try block.
 */
