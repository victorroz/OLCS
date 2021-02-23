package com.company;

public class Book {
    // Attributes
    private int bookId;
    private String bookTitle;
    private String bookAuthor;

    // Constructor
    public Book(int bookId, String bookTitle, String bookAuthor) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    // Methods
    public void printInfo() {
        System.out.println("ID: " + bookId);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
    }
}
