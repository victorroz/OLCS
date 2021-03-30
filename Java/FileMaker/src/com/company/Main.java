package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Maker[] maker = new Maker[1];

	    for (int i = 0; i < maker.length; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("File name: ");
            String fName = scanner.nextLine();

            System.out.print("File extension: ");
            String fExt = scanner.nextLine();

            System.out.print("File Contents: ");
            String fContent = scanner.nextLine();

//            System.out.println(fName + " " + fExt + " " + fContent);

            maker[i] = new Maker(fName, fExt, fContent);
        }

	    for (int i = 0; i < maker.length; i++) {
	        maker[i].ShowInfo();
        }
    }
}
