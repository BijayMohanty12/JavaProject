package com.Java.Student_Grade_Calculator.Calculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner next= new Scanner(System.in);
        System.out.println("Enter a first number");
        float number1= next.nextFloat();
        float output=0;
        System.out.println("Enter a operator(+,-,%,/,*)");
        char operator=next.next().charAt(0);
        if(operator!='+'&&operator!='-'&&operator!='%'&&operator!='/'&&operator!='*')
        {
            System.out.println("Please Enter a correct operator as we given ");
            return;

        }
        System.out.println("Enter a second number");
        float number2= next.nextFloat();

        switch(operator) {
            case '+':
                output = number1 + number2;
                break;

            case '-':
                output = number1 - number2;
                break;

            case '%':
                output = number1 % number2;
                break;

            case '/':
                if (number2 == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    output = number1 / number2;
                    break;
                }
            case '*':
                output = number1 * number2;
                break;
        }
        System.out.println("Output of this Calculation: "+output);


    }



}

