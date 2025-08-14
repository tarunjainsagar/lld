package com.learning.accessmodifiers.packageOne;

public class SameFolderClass {

    public void run() {
        ParentClass p = new ParentClass();
        System.out.println(p.name);
        System.out.println(p.age);
        // System.out.println(p.houseNo); // Not accessible
    }
}
