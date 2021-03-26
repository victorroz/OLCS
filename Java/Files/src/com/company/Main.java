package com.company;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("W:\\file.txt");
            if (file.createNewFile()) {
                System.out.println("Created");
            } else {
                System.out.println("Exists");
            }
        } catch (IOException e) {
            System.out.println("Error occurred.");
//            e.printStackTrace();
        }
    }
}
