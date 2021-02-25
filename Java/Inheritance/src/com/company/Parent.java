package com.company;

public class Parent extends GrandParent {
    private String name;
    private int bankBalance;

    public Parent(String name, int bankBalance) {
        this.name = name;
        this.bankBalance = bankBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void printName() {
        super.printName();
        System.out.println("Called from Parent");
    }

    public int printBankBalance() {
        return this.bankBalance;
    }
}
