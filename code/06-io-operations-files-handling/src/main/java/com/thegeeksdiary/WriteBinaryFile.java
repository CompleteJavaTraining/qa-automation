package com.thegeeksdiary;

import java.io.*;

public class WriteBinaryFile {
    public static void main(String[] args) {
        try {
            // create a new DataOutputStream object
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\Development\\training\\qa-automation\\code\\06-io-operations-files-handling\\src\\main\\java\\com\\thegeeksdiary\\numbers.bin"));
            // write each integer to the binary file
            dos.writeInt(10);
            dos.writeDouble(55.67);
            dos.writeBoolean(true);
            // close the DataOutputStream object
            dos.close();

            System.out.println("Successfully wrote integers to binary file!");
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
