package com.learning.librarymanagement;

public class TestClass {


    public static void main(String[] args) {
        Member m1 = new Member();
        /*m1.displayDashboard();
        m1.display();*/

        Librarian l1 = new Librarian();
        /*l1.displayDashboard();
        l1.display();*/

        Member m2 = new Member();
        /*m2.displayDashboard();
        m2.display();*/

        LibraryManagementSystem lms = new LibraryManagementSystem();
//        Book b1 = new Bo
//        lms.addBook();

        lms.addUser(m1);
        lms.addUser(l1);
        lms.addUser(m2);
        for (User u: lms.getRegisteredUsers()) {
            u.display();
        }
    }
}
