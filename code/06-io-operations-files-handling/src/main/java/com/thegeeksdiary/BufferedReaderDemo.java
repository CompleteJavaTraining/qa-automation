package com.thegeeksdiary;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            // create a new BufferedReader object to read input from the console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // prompt the user to enter their name
            System.out.println("Enter your name:");

            // read the name from the console
            String name = br.readLine();

            // prompt the user to enter their age
            System.out.println("Enter your age:");

            // read the age from the console
            String ageInput = br.readLine();
            int age = Integer.parseInt(ageInput);

            // print the user's name and age
            System.out.println("Your name is " + name + " and you are " + age + " years old.");

            if(age>65){
                System.out.println("You are senior citizen");
            } else {
                System.out.println("You are young person");
            }

            // close the BufferedReader object
            br.close();
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}

