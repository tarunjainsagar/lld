package com.learning.librarymanagement;

public class Member extends User {

    private int borrowedBooksCount;

    public static final int MAX_BORROW_LIMIT = 5;

    public Member() {
    }

    public Member(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(User u, int borrowedBooksCount) {
        super(u);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
    
}
