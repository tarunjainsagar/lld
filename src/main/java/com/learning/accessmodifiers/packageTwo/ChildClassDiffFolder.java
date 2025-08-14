package com.learning.accessmodifiers.packageTwo;

import com.learning.accessmodifiers.packageOne.ParentClass;

public class ChildClassDiffFolder extends ParentClass {

    public void run() {
        ParentClass p = new ParentClass();
//        System.out.println(p.name); // Incorrect Usage
//        System.out.println(p.age); // Not accessible
//         System.out.println(p.houseNo); // Not accessible

        System.out.println(this.name); // Correct usage
//        System.out.println(this.age); // Not accessible
    }
}