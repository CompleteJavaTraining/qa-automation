package com.thegeeksdiary;

import java.util.Arrays;

public class MethodsDemo2 {

    public static void main(String[] args) {

        // String methods
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Substring: " + str.substring(7));
        System.out.println("Substring: " + str.substring(0,5));
        System.out.println("Index of 'o' (from beginning): " + str.indexOf('o'));
        System.out.println("Index of 'o' (after 6th character): " + str.indexOf('o', 5));
        System.out.println("Index of '8' (doesn't exist): " + str.indexOf('8'));
        System.out.println("Uppercase String: " + str.toUpperCase());
        System.out.println("Lowercase String: " + str.toLowerCase());

        // Array methods
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {1, 2, 3};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        // Equality check using Arrays.equals() method
        if (Arrays.equals(arr1, arr3)) {
            System.out.println("Array 1 and Array 3 are equal.");
        } else {
            System.out.println("Array 1 and Array 3 are not equal.");
        }

        // Equality check using Arrays.equals() method
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Array 1 and Array 2 are equal.");
        } else {
            System.out.println("Array 1 and Array 2 are not equal.");
        }

        // Copying array using Arrays.copyOf() method
        int[] arr4 = Arrays.copyOf(arr1, arr1.length);
        //int[] arr4 = arr1;
        System.out.println("Array 4: " + Arrays.toString(arr4));

        // Numerical methods
        int x = -5;
        int y = 10;


        System.out.println("Absolute value of x: " + Math.abs(x));
        System.out.println("Max value of x and y: " + Math.max(x, y));
        System.out.println("Min value of x and y: " + Math.min(x, y));
        System.out.println("x^Y is: " + Math.pow(x,y));
        System.out.println("Square root of y: " + Math.sqrt(y));
        System.out.println("Random number between 0 and 1: " + Math.random());

        // Character and string methods
        char ch = 'A';
        char lineBreak = '\n';
        char tab = '\t';
        char space = ' ';
        System.out.println("Lowercase character: " + Character.toLowerCase(ch));
        System.out.println("Uppercase character: " + Character.toUpperCase(ch));
        System.out.println("Character is digit: " + Character.isDigit(ch));
        System.out.println("Character is letter: " + Character.isLetter(ch));
        System.out.println("Character is whitespace: " + Character.isWhitespace(ch));

        System.out.println("Character lineBreak is whitespace: " + Character.isWhitespace(lineBreak));
        System.out.println("Character tab is whitespace: " + Character.isWhitespace(tab));
        System.out.println("Character space is whitespace: " + Character.isWhitespace(space));
    }

}

/*
 * In this program, we demonstrate various methods:
 * String methods such as length(), substring(), indexOf(), and toUpperCase().
 * Array methods such as Arrays.toString(), Arrays.equals(), and Arrays.copyOf().
 * Numerical methods such as Math.abs(), Math.max(), Math.sqrt(), and Math.random().
 * Character and string methods such as Character.toLowerCase(), Character.toUpperCase(), Character.isDigit(), Character.isLetter(), and Character.isWhitespace().
 *
 * We also demonstrate the use of conditional statements to compare arrays using the Arrays.equals() method.
 *
 * Finally, we call each of these methods with appropriate arguments to demonstrate their functionality.
 */
