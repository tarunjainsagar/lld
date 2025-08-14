package com.learning.accessmodifiers.packageOne;

public class ParentClass {

    // Default: Package-Private
    int age;

    static String FIELD_ONE = "";

    {
//        FIELD_ONE = "Je";
    }

    public ParentClass() {
//        FIELD_ONE = "Je";
    }

    // Protected
    protected String name;

    // Private
    private int houseNo;

    static void show() {
        System.out.println("Method Hiding");
    }

    static void show(int a) {
//        System.out.println(FIELD_ONE);
//        age = 20; // Non-static field 'age' cannot be referenced from a static context
        System.out.println("Overriding Hidden Method");
    }

    public String getWorld() {
        FIELD_ONE = "hi";
        System.out.println("Hello Parent World");
        return "Hello World";
    }

    public String myWorld() {
        Character first = getFirst();
        return "My World";
    }

    private static Character getFirst() {
        return ITest.Constants.getFirst();
    }
}
