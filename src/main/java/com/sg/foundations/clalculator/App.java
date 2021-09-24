package com.sg.foundations.clalculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean x = true;
        if (x) {
            int choice;
            do {

                SimpleCalculator calculator = new SimpleCalculator();
                Scanner input = new Scanner(System.in);
                System.out.println("**************************");
                System.out.println("WELCOME TO MY CALCULATOR");
                System.out.println("**************************");

                System.out.println("insert the first operand : ");
                System.out.println("**************************");
                double num1 = input.nextDouble();
                System.out.println("**************************");
                System.out.println("insert the seconf operand : ");
                double num2 = input.nextDouble();

                System.out.println(" PLEASE SELECT THE OPERATION: ");
                System.out.println(" SELECT <1> FOR  + ");
                System.out.println(" SELECT <2> FOR  * ");
                System.out.println(" SELECT <3> FOR  / ");
                System.out.println(" SELECT <4> FOR  - ");

                int ope = input.nextInt();

                switch (ope) {
                    case 1:
                        calculator.addition(num1, num2);
                        break;
                    case 2:
                        calculator.multiplication(num1, num2);
                        break;
                    case 3:
                        calculator.division(num1, num2);
                        break;
                    case 4:
                        calculator.subtraction(num1, num2);
                        break;
                    default:
                        System.out.println("PEASE CHOOSE THE OPERATOR FROM THE LIST");
                        break;
                }
                System.out.println(" do you want calculate again? ");


                System.out.println("1- YES");
                System.out.println("2- NO");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        x = true;
                        break;
                    case 2:
                        x = false;
                        System.out.println("THANKS GOOD BYE");
                        break;
                    default:
                        System.out.println("Choose -1- if YES or -2-   if NO");
                        break;
                }
            } while (choice < 2);
        }

    }

    }

