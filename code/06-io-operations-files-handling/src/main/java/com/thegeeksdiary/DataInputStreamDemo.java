package com.thegeeksdiary;

import java.io.*;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            // create a new DataInputStream object
            DataInputStream dis = new DataInputStream(new FileInputStream("D:\\Development\\training\\qa-automation\\code\\06-io-operations-files-handling\\src\\main\\java\\com\\thegeeksdiary\\numbers.bin"));

            // read integer from the file
            int intValue = dis.readInt();
            System.out.println("Read integer value: " + intValue);

            // read double from the file
            double doubleValue = dis.readDouble();
            System.out.println("Read double value: " + doubleValue);

            // read boolean from the file
            boolean boolValue = dis.readBoolean();
            System.out.println("Read boolean value: " + boolValue);

            // close the DataInputStream object
            dis.close();
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}

