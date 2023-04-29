package com.thegeeksdiary;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //read from console aka stdin (standard input)
        System.out.print("Enter your name: "); //print on the console aka stdout (standard output)
        String name = scanner.nextLine(); //wait until the end of line
        System.out.println("Hello, " + name);

        scanner = new Scanner("1 fish 2 fish red fish blue fish");
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println(word);
        }
        scanner.close();
        try {
            File file = new File("D:\\Development\\training\\qa-automation\\code\\06-io-operations-files-handling\\src\\main\\java\\com\\thegeeksdiary\\input.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            scanner.close();
        }
    }
}
