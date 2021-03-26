package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Example 1
        try {
            File file = new File("file.txt");
            if (file.createNewFile()) {
                System.out.println("Created");
            } else {
                System.out.println("Exists");
            }
        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }

        // Example 2
        try {
            FileWriter fileWriter = new FileWriter("file2.txt");
            fileWriter.write("Hello from file2.\n");
            fileWriter.write("Hello from file2 line 2.");
            fileWriter.close();
            System.out.println("FileWrite Successfull.");
        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}
