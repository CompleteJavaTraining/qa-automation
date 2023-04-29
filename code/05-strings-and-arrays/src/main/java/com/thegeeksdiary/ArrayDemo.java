package com.thegeeksdiary;

public class ArrayDemo {
    public static void main(String[] args) {

        // One-dimensional array
        int[] arr1 = new int[5]; // creation of array
        arr1[0] = 1; // initialization and assignment
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 50;

        /*
         * 1. read file
         * 2. read elements and store them in count varibale
         * 3. create an array of length count -> int[] array = new int[count]
         */

        //only store values in some indexes only.
        int[] arryRandom = new int[500];
        arryRandom[10] = 20;
        arryRandom[50] = 40;

        //create an initialize in a single statement
        int[] someArray = new int[] {1, 5, 8, 10, 20};

        System.arraycopy(someArray, 0, arr1, 0, arr1.length);
        for (int i = 0; i < someArray.length; i++) {
            System.out.println("SomeArray[" + i + "] = " + someArray[i]);
        }

        // Accessing elements of array
        System.out.println("Element at index 0: " + arr1[0]);
        System.out.println("Element at index 3: " + arr1[3]);
        System.out.println("Element at index 4: " + arr1[4]);

        System.out.println("This will give out of index/bounds error: " + arr1[5]);

        // Copying arrays
        int[] arr2 = new int[5];
        System.arraycopy(arr1, 0, arr2, 0, 5);

        // Multi-dimensional array
        int[][] arr3 = new int[3][3]; // creation of array
        arr3[0][0] = 1; // initialization and assignment
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[1][0] = 4;
        arr3[1][1] = 5;
        arr3[1][2] = 6;
        arr3[2][0] = 7;
        arr3[2][1] = 8;
        arr3[2][2] = 9;

        // Accessing elements of multi-dimensional array
        System.out.println("Element at index [0][1]: " + arr3[0][1]);
        System.out.println("Element at index [2][2]: " + arr3[2][2]);
    }
}

/*
 * In this program, we create a one-dimensional array of integers using the new keyword and initialize
 * and assign values to its elements. We then access elements of the array using the square bracket notation [].
 * We also copy the array using the System.arraycopy() method.
 * We then create a multi-dimensional array of integers using the new keyword and initialize and assign values to its elements.
 * We access elements of the multi-dimensional array using the square bracket notation [][].
 * Note that we can create arrays of any type in Java, including arrays of objects.
 * Additionally, we can have arrays with any number of dimensions, although one- and two-dimensional arrays are the most common.
 */
