package com.company;

public class GrandParent {
    private String name;
    private int bankBalance;

    public GrandParent() {

    };

    public GrandParent(String name, int bankBalance) {
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

    protected void printName() {
        System.out.println("Called from GrandParent");
    }

    public int printBankBalance() {
        return this.bankBalance;
    }
}
