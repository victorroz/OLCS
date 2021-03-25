package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breakPoint = 0;

        // Example 1
        do {
            try {
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                int div = num1 / num2;
                System.out.println("Value of division: " + div);
                breakPoint = 2;
            } catch (Exception e) {
                System.out.println("Cannot divide by 0.");
            } finally {
                System.out.println("Done executing...");
            }
        } while(breakPoint == 0);

        // Example 2 - Custom Exception
        try {
            if(5 < 4) {
                System.out.println(true);
            } else {
                System.out.println("Else");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Catch");
        }

    }
}
