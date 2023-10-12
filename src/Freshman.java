//package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{ // inheriting from the Student class.

    // Constructor that accepts name, age, and credits.
    public Freshman(String name, short age, int credits){

        super(name, age, credits); // calls constructor of the super class.
    }

    //returns string representing a Freshman object.
    public String toString(){
        return super.toString() +
                "Class: Freshman" + "\n";
    }
}