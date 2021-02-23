package com.company;

public class Student {
    private int stdId;
    private String stdName;
    private char stdGender;
    private int stdClass;
    private String stdEmail;

    public Student(int stdId, String stdName, char stdGender, int stdClass, String stdEmail) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdGender = stdGender;
        this.stdClass = stdClass;
        this.stdEmail = stdEmail;
    }

    public void setStdId(int stdId) { this.stdId = stdId; }

    public int getStdId() { return this.stdId; }

    public void printStudentInfo() {
        System.out.println("|-----STUDENT DETAILS-----|");
        System.out.println("ID: " + stdId);
        System.out.println("Name: " + stdName);
        System.out.println("Gender: " + stdGender);
        System.out.println("Class: " + stdClass);
        System.out.println("Email: " + stdEmail);
    }
}
