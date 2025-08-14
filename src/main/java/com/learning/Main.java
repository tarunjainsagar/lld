package com.learning;

import com.learning.accessmodifiers.packageOne.ChildClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        ParentClass p = new ParentClass();
//        p.getWorld();

        ChildClass c = new ChildClass();
        c.getWorld();
        System.out.println(c.myWorld());
//        ParentClass x = new ChildClass();
//        x.getWorld();

//        ChildClass y = new ParentClass();
    }
}