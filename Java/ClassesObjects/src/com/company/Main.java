package com.company;

public class Main {

    public static void main(String[] args) {
        Student std1 = new Student(1, "Remon", 'H', 1, "vanilla@gmail.com");

        std1.printStudentInfo();

        std1.setStdId(23);

        std1.printStudentInfo();
    }
}
