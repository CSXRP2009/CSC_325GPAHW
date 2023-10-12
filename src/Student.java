//package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{ // Inheriting from the Human class
    // ToDo 1: Make this class a child of Human

    // ToDo 2: Fix the resulting errors

    // ToDo 3: Add a field for GPA and create a setter and a getter

    // ToDo 4: Add comments to your code
    private double GPA; // class field for a GPA.
    private int credits; // class field for credits.

    // constructor that accepts name and age
    public Student (String name, short age ){
        super(name, age); // calls constructor of super class
    }

    // overloaded constructor that accepts name, age and credits.
    public Student (String name, short age, int credits ){
        super(name, age); // calls constructor of super class
        this.credits = credits; // initializing credits field.
    }

    //  getter method for GPA.
    public double getGPA(){
         return GPA;
    }

    // setter method for GPA.
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // getter method for credits.
    public int getCredits() {
        return credits;
    }

    // setter for the credits.
    public void setCredits(int credits) {
        this.credits = credits;
    }

    // getter method for address.
    public String getAddress() {
        return address;
    }

    // setter method for address.
    public void setAddress(String address){
        this.address = address;
    }

    // returns string representing Student object.
    public String toString(){
        return "Name: " + super.getName() + "\n" +
                "Age: " + super.getAge() + "\n" +
                "Address: " + address + "\n" +
                "GPA: " + GPA + "\n" +
                "Credits: " + credits + "\n";
    }
}
