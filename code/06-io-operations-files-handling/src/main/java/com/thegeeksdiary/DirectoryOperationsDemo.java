package com.thegeeksdiary;

import java.io.File;
import java.io.IOException;

public class DirectoryOperationsDemo {
    public static void main(String[] args) {

        // Creating a directory
        File directory = new File("D:\\Development\\training\\qa-automation\\code\\06-io-operations-files-handling\\src\\main\\java\\com\\thegeeksdiary\\myDirectory");
        if (!directory.exists()) {
            boolean result = directory.mkdir();
            if (result) {
                System.out.println("Directory created: " + directory.getAbsolutePath());
            } else {
                System.out.println("Failed to create the directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }

        // Creating a file inside the directory
        File file = new File(directory, "myFile.txt");
        if (!file.exists()) {
            try {
                boolean result = file.createNewFile();
                if (result) {
                    System.out.println("File created: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create the file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }

        // Listing files in the directory
        System.out.println("Files in the directory:");
        File[] files = directory.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }

        // Deleting the file and the directory
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        if (directory.delete()) {
            System.out.println("Directory deleted: " + directory.getName());
        } else {
            System.out.println("Failed to delete the directory.");
        }
    }
}

/*
 * In this program, we demonstrate directory operations in Java using the File class.
 * First, we create a directory using the File class and the mkdir() method.
 * We check if the directory already exists using the exists() method. If the directory is created successfully, we print a message indicating that the directory has been created.
 *
 * Next, we create a file inside the directory using the File class and the createNewFile() method. We check if the file already exists using the exists() method.
 * If the file is created successfully, we print a message indicating that the file has been created.
 *
 * Then, we list the files in the directory using the listFiles() method.
 * We iterate over the files in the directory using a for-each loop and print the name of each file to the console.
 *
 * Finally, we delete the file and the directory using the delete() method.
 * If the file or directory is deleted successfully, we print a message indicating that the file or directory has been deleted.
 * If the file or directory cannot be deleted, we print an error message.
 */
