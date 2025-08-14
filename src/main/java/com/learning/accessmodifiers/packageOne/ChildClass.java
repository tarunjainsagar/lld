package com.learning.accessmodifiers.packageOne;

public class ChildClass extends ParentClass {

    public void run() {
        ParentClass p = new ParentClass();
        System.out.println(p.name);
        System.out.println(p.age);
        // System.out.println(p.houseNo); // Not accessible

        System.out.println(this.name);
        System.out.println(this.age);
//        System.out.println(this.houseNo);
    }

//    void getWorld() {
//        System.out.println("Hello Child World");
//    }

    static void show() {
        System.out.println("Child method hiding");
    }

    public String getWorld() {
        System.out.println("Hello Child World");
        return "Child World";
    }
}
