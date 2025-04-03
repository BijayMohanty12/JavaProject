package com.Java.Student_Grade_Calculator.Calculator;

import java.util.Scanner;

import java.util.Scanner;

public class SimpleGradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // ✅ Single Scanner instance

        while (true) {
            System.out.println("Enter your Choice: Y/N");
            System.out.print("If you want to continue: ");
            String choice = String.valueOf(in.next().charAt(0));

            switch (choice.toLowerCase()) {
                case "y":
                    GradeCalculator(in); // ✅ Pass Scanner object to method
                    break;

                case "n":
                    System.out.println("Exiting program...");
                    return; // ✅ Directly exit

                default:
                    System.out.println("Enter a valid choice (Y/N)");
            }
        }
    }

    private static void GradeCalculator(Scanner in) {
        in.nextLine();
        System.out.println("Enter your Name:");
        String name = in.next();
        in.nextLine();
        System.out.println("Enter your English Marks:");
        double english = in.nextDouble();

        System.out.println("Enter your Maths Marks:");
        double maths = in.nextDouble();

        System.out.println("Enter your Science Marks:");
        double science = in.nextDouble();

        System.out.println("Enter your History Marks:");
        double history = in.nextDouble();

        System.out.println("Enter your Geography Marks:");
        double geography = in.nextDouble();

        double totalMarks = 500;
        double obtainedMarks = english + maths + science + history + geography;
        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("\nStudent Name: " + name);
        System.out.printf("ObtainMarks: %.2f%n", obtainedMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage); // ✅ Corrected percentage format

        // ✅ Improved grading system
        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else grade = "F";

        System.out.println("Grade: " + grade);
    }
}
