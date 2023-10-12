//package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        // ToDo 5: Fix the error

        // ToDo 6: Fix the constructor of the Student class

        // Todo 7: Create two classes for Freshman and Senior

        // ToDo 8: The senior class should have a minimum of 85 credits

        // ToDo 9: Add a toString method for the Student class
        // ToDo 10: Add a toString method for the Freshman class
        // ToDo 11: Add a toString method for the Senior class

        // Create a new Student object
        Student std1= new Student("James", (short)20);

        // Create a new Freshman object
        Student std2= new Freshman("Jeffrey", (short)20, 12); // name, age, credits

        // Create a new Senior object
        Student std3 = new Senior("John", (short)30, 90);

        // ToDo 12: Set the gpa of the student using the scanner and user
        // 			input and then print the output.

        // Creates Scanner object to read from the keyboard.
        Scanner input = new Scanner(System.in);

        // Gets and sets GPA for student 1.
        System.out.print("Enter GPA for student 1: ");
        double GPA1 = input.nextDouble();
        std1.setGPA(GPA1);

        // Gets and sets GPA for student 2.
        System.out.print("Enter GPA for student 2: ");
        double GPA2 = input.nextDouble();
        std2.setGPA(GPA2);

        // Gets and sets GPA for student 3.
        System.out.print("Enter GPA for student 3: ");
        double GPA3 = input.nextDouble();
        std3.setGPA(GPA3);

        //Displays information for all three students.
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);

        // ToDo 13: add comments and explain your code

        // ToDo 14: submit using a pull request.
    }

}

