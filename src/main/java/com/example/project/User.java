package com.example.project;

public class User{
//This class represents a user with attributes for their name, id, and book list. It allows the modification of a user's info.

//attributes representing a user's name, ID, and book list
    private String name;
    private String Id;
    private Book[] book = new Book[0];
    
    //constructor method to initialize name and Id
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    //getter method for a user's name
    public String getName() {
        return name;
    }

    //setter method for a user's name
    public void setName(String newName) {
        name = newName;
    }

    //getter method for a user's ID
    public String getId() {
        return Id;
    }

    //setter method for a user's ID
    public void setId(String newId) {
        Id = newId;
    }

    //getter method for a user's book list
    public Book[] getBooks() {
        return book;
    }

    //setter method for a user's book list
    public void setBooks(Book[] newBook) {
        book = newBook;
    }      
}