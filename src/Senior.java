//package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{  // inheriting from Student class.
    private final int MIN_CREDITS = 85; // Minimum credits to graduate.

    // Constructor that accepts name, age, and credits.
    public Senior(String name, short age, int credits){
          super(name, age, credits); // calls constructor of the super class.
    }

    //returns string representing a Senior object.
    public String toString(){
        return super.toString() +
                "Minimum Credits: " + MIN_CREDITS + "\n" +
                "Class: Senior" + "\n";
    }
}
