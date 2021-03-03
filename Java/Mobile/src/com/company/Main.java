package com.company;

public class Main {

    public static void main(String[] args) {
	    Mobile m1 = new Mobile("John", "0185494957", 100.0f, "Android", false);

	    m1.showInfo();

	    m1.rechargeAmount(28f);

	    m1.showInfo();

	    m1.callSomeone(120f);

	    m1.showInfo();
    }
}
