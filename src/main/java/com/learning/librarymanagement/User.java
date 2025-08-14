package com.learning.librarymanagement;

public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;

    private static int totalUsers = 0;

    public User() {
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User u) {
        this.name = u.name;
        this.contactInfo = u.contactInfo;
    }

    public final String generateUniqueId() {
        return String.valueOf(++totalUsers);
    }

    abstract void displayDashboard();

    abstract boolean canBorrowBooks();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void display() {
        System.out.println("UserId: " + this.userId);
        System.out.println("Name: " + this.name);
        System.out.println("ContactInfo: " + this.contactInfo);
    }
}
