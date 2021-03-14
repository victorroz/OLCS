package com.company;

public class Main {

    public static void main(String[] args) {
	    ReadyPlayer rp1 = new ReadyPlayer("John Doe", "johndoe");

	    rp1.showInfo();

        ReadyPlayer rp2 = new ReadyPlayer("Alice", "alice");
        rp2.showInfo();
    }
}
