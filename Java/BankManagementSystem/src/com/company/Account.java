package com.company;

public class Account {
    private String id;
    private String name;
    private String type;
    private float balance;
    private static int counter;

    public Account(String name, String type, float balance) {
        this.id = idCreator();
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public String idCreator() {
        return ("ABC_" + ++counter);
    }

    public void withdrawAmount(float amount) {
        if(this.balance - amount >= 500) {
            this.balance -= amount;
            System.out.println("Amount withdraw successful. \nRemaining balance: " + this.balance);
        }
        else {
            System.out.println("Withdraw amount not accepted.");
        }
    }

    public void depositAmount(float amount) {
        if(amount >= 100.0f && amount <= 100000.0f) {
            this.balance += amount;
            System.out.println("Amount deposit successful. \nYour current balance is: " + this.balance);
        }
        else {
            System.out.println("Please deposit amount between the range BDT 100 and BDT 100 000.");
        }
    }
}
