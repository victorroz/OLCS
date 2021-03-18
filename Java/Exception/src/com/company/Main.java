package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breakPoint = 0;

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
            }
        } while(breakPoint == 0);
    }
}
