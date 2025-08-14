package com.learning.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private List<Book> bookInventory;

    private List<User> registeredUsers;

    public LibraryManagementSystem() {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    void addBook(Book book) {
        bookInventory.add(book);
    }

    void addUser(User user) {
        registeredUsers.add(user);
    }

    public List<Book> getBookInventory() {
        return bookInventory;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }
}
