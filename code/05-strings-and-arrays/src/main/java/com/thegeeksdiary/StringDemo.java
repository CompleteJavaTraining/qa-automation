package com.thegeeksdiary;

//Abacus
//Apple
//Apron
/*
 * Rajib: Apple
 * Hira: Apple
 * Shah: Apple
 */

public class StringDemo {
    public static void main(String[] args) {

        //char
        char[] c = new char[]{'C', 'H', 'a', 'r'};
        String hello = new String(c);
        System.out.println(hello);

        // Create string using string literal
        String str1 = "Hello";

        String str4 = str1;

        // Create string using new keyword
        String str2 = new String("World");

        // Concatenate two strings
        String str3 = str1 + " " + str2;

        System.out.println("str1 + \" \" + str2 = " + str3);

        // Compare two strings lexicographically using compareTo()
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("str1 is less than str2");
        } else if (result > 0) {
            System.out.println("str1 is greater than str2");
        } else {
            System.out.println("str1 is equal to str2");
        }

        // Compare two strings for equality using equals()
        boolean isEqual = str1.equals(str2);
        if (isEqual) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is not equal to str2");
        }

        // Compare two strings for reference equality using ==
        boolean isSame = (str1 == str4);
        if (isSame) {
            System.out.println("str1 and str4 refer to the same object");
        } else {
            System.out.println("str1 and str4 refer to different objects");
        }

        // Compare two strings for reference equality using ==
        isSame = (str1 == str2);
        if (isSame) {
            System.out.println("str1 and str2 refer to the same object");
        } else {
            System.out.println("str1 and str2 refer to different objects");
        }
    }
}

/*
 * In this program, we create two strings using a string literal and the new keyword. We then concatenate the two strings using the + operator
 * and store the result in another string.
 * We then compare the two strings using the compareTo() method and print whether str1 is less than, greater than, or equal to str2.
 * We also compare the two strings for equality using the equals() method and for reference equality using the == operator, and print the results accordingly.
 */
