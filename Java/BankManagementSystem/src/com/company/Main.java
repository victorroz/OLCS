package com.company;

public class Main {

    public static void main(String[] args) {
        Account acc1 = new Account("Victor", "Student Account", 700.0f);

        acc1.depositAmount(50.0f);

        Account acc2 = new Account("Ariq", "Student Account", 1000.0f);
    }
}
