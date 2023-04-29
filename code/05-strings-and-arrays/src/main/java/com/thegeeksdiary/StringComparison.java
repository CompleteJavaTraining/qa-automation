package com.thegeeksdiary;

public class StringComparison {
    public static void main(String[] args) {
        String third = "Abacus";
        String first = "Apple";
        String second = "Apron";

        int result = third.compareTo(first);
        if(result<0) {
            System.out.println(third + " less than " + first);
        } else if (result == 0) {
            System.out.println(third + " equals " + first);
        } else {
            System.out.println(third + " greater than " + first);
        }

        result = first.compareTo(second);
        if(result<0) {
            System.out.println(first + " less than " + second);
        } else if (result == 0) {
            System.out.println(first + " equals " + second);
        } else {
            System.out.println(first + " greater than " + second);
        }

        result = second.compareTo(third);
        if(result<0) {
            System.out.println(second + " less than " + third);
        } else if (result == 0) {
            System.out.println(second + " equals " + third);
        } else {
            System.out.println(second + " greater than " + third);
        }
    }
}
