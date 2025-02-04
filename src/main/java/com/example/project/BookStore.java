package com.example.project;

public class BookStore {
//This class represents a bookstore with its attributes and methods. 
//It allows the creation, modification, and retrieval of bookstore information 
//including users and books in the store. 
    
    //array attribute representing a list of books
    private Book[] books = new Book[5];
    //array attribute representing a list of users
    private User[] users = new User[10];
    //int attribute used to track the number of books
    private int bookCount = 0;
    //int attribute used to track the number of users
    private int userCount = 0;
    
    //empty constructor method
    public BookStore() {
        
    }

    //getter method for the list of users
    public User[] getUsers() {
        return users;
    }

    //setter method for the list of users
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }


    //getter method for the list of books
    public Book[] getBooks() {
        return books;
    }

    //method to allow the addition of users to the user list
    public void addUser(User user) {
        users[userCount] = user;
        userCount++;
    } 

    //method to alow the removal of users from the user list
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
            }
        }
    }

    //method that consolidates the list of users so that any and all null values are at the end
    public void consolidateUsers() {
        User[] temp = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                temp[count] = users[i];
                count++;
            }
        }
        for (int i = 0; i < users.length; i++) {
            users[i] = temp[i];
        }
    }

    //method to allow the addition of books to the book list
    public void addBook(Book book) {
        books[bookCount] = book;
        bookCount++;
    }

    //method to allow the insertion of books to specific indices in the book list
    public void insertBook(Book book, int index) {
        books[index] = book;
    }

    //method to allow the removal of books from the book list
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i] = null;
            }
        }
    }
}