package com.example.project;

public class Book{
//This class represents a Book with its attributes and methods. It allows the creation, modification, and retrieval of Book information. 
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        //Private attributes to represent Book information
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.

    //getter method for the title of a book
    public String getTitle() {
        return title;
    }

    //setter method for the title of a book
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    //getter method for the name of the author of a book
    public String getAuthor() {
        return author;
    }

    //setter method for the name of the author of a book
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    //getter method for the year published of a book
    public int getYearPublished() {
        return yearPublished;
    }

    //setter method for the year published of a book
    public void setYearPublished(int newYearPublished) {
        yearPublished = newYearPublished;
    }

    //getter method for the ISBN of a book
    public String getIsbn() {
        return isbn;
    }

    //setter method for the ISBN of a book
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    //getter method for the quantity of a book
    public int getQuantity() {
        return quantity;
    }

    //setter method for the quantity of a book
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    //returns a string of information about a book including title, author, year published, ISBN, and quantity of that book
    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    } //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
       
}