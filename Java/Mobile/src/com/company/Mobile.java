package com.company;

public class Mobile {
    private static int id;
    private String mobileOwnerName;
    private String mobileNumber;
    private float mobileBalance;
    private String mobileOsName;
    private boolean lock;

    public Mobile(String mobileOwnerName, String mobileNumber, float mobileBalance, String mobileOsName, boolean lock) {
        this.id += 1;
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOsName = mobileOsName;
        this.lock = lock;
    }

    public void showInfo() {
        if(!this.lock) {
            System.out.println("|-----Mobile Informations-----|");
            System.out.println("Owner Name: " + this.mobileOwnerName);
            System.out.println("Number: " + this.mobileNumber);
            System.out.println("Balance: BDT" + this.mobileBalance);
            System.out.println("OS: " + this.mobileOsName);
            System.out.println();
        }
        else {
            System.out.println("Please unlock your phone first.\n");
        }
    }

    public void rechargeAmount(float amount) {
        if(!this.lock) {
            this.mobileBalance += amount;
            System.out.println("Recharge Successful. Your current balance is: BDT " + this.mobileBalance);
            System.out.println();
        }
        else {
            System.out.println("Please unlock your phone first.\n");
        }
    }

    public void callSomeone(float timeDuration) {
        if(!this.lock) {
            if(timeDuration * 0.71f <= this.mobileBalance) {
                this.mobileBalance -= timeDuration * 0.71f;
                System.out.println("Your remaining balance: BDT " + this.mobileBalance);
                System.out.println();
            }
            else {
                System.out.println("Please recharge.\n");
            }
        }
        else {
            System.out.println("Please unlock your phone first.\n");
        }
    }
}
