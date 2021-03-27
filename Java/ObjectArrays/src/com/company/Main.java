package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Phone[] phone = new Phone[2];

	    // For taking inputs
	    for(int i = 0; i < phone.length; i++) {
	        Scanner scanner = new Scanner(System.in);

            System.out.print("Manufacture: ");
	        String manufacturer = scanner.nextLine();
            System.out.print("Model: ");
	        String model = scanner.nextLine();

            phone[i] = new Phone(manufacturer, model);

            System.out.println();
        }

        // For showing infos
        for(int i = 0; i < phone.length; i++) {
            phone[i].showInfo();
        }
    }
}
