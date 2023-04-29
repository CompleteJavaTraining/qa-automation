package com.thegeeksdiary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {

        // Creating a file
        try {
            File file = new File("output.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Writing to a file
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, world!\n");
            writer.write("This is a sample file.\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            File file = new File("output.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        // Deleting a file
        File file = new File("output.txt");
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

/*
 * In this program, we demonstrate file handling in Java using the File class and the FileWriter and Scanner classes.
 * First, we create a file using the File class and the createNewFile() method. We check if the file already exists using the exists() method.
 * If the file is created successfully, we print a message indicating that the file has been created.
 *
 * Next, we write some text to the file using the FileWriter class and the write() method. We close the file using the close() method.
 * If the write operation is successful, we print a message indicating that the write operation was successful.
 *
 * Then, we read the contents of the file using the Scanner class and the hasNextLine() and nextLine() methods.
 * We print each line of the file to the console. If the file is not found, we print an error message.
 *
 * Finally, we delete the file using the delete() method.
 * If the file is deleted successfully, we print a message indicating that the file has been deleted. If the file cannot be deleted, we print an error message.
 */
