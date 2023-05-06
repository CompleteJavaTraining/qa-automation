## Problem Statement

Your task is to implement a program that can perform various input/output (I/O) and file handling operations.

### Part 1: Input/Output Operations

1. Write a method `readInt` that uses `System.in` and `Scanner` class to read an integer from the user and return it as an `int`. If the user enters a non-integer value, your method should prompt the user to enter a valid integer.

2. Write a method `readString` that uses `System.in` and `BufferedReader` class to read a string from the user and return it as a `String`.

3. Write a method `writeToFile` that takes a `String` and a filename as inputs and writes the `String` to a file with the given filename. If the file does not exist, your method should create the file.

### Part 2: File Handling

1. Write a method `readFile` that takes a filename as input and reads the contents of the file into a `String`. Your method should return the `String` containing the contents of the file.

2. Write a method `countWords` that takes a filename as input and returns the number of words in the file. For the purposes of this assignment, a word is any sequence of characters separated by whitespace.

3. Write a method `replaceWord` that takes a filename, a word to replace, and a replacement word as inputs. Your method should read the contents of the file, replace all occurrences of the specified word with the replacement word, and write the modified contents back to the file.

### Part 3: Main Program

Write a main program that prompts the user to select an operation (I/O or file handling), and then performs the selected operation based on user input. The program should continue prompting the user for input until the user chooses to quit.

## Requirements

- Your program must compile and run without errors.
- You must use the Java programming language.
- You may not use any external libraries or frameworks.
- You must implement all of the required methods as specified above.
- You must implement a main program that allows the user to select an operation and performs the selected operation based on user input.
- Your code must be well-organized and easy to read.
- Your code must include comments that describe the purpose of each method and major block of code.